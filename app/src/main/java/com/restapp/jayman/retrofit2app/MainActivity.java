package com.restapp.jayman.retrofit2app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.Log;

import com.restapp.jayman.retrofit2app.Controller.WSController;
import com.restapp.jayman.retrofit2app.Controller.WSModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.restapp.jayman.retrofit2app.Controller.WSController.API_ENDPOINT;
import static com.restapp.jayman.retrofit2app.Controller.WSController.EMPLOYEE;

public class MainActivity extends AppCompatActivity {

    private static final String REST_LOG = MainActivity.class.getSimpleName();
    private RecyclerView recyclerView;
    private SearchView searchview;
    private EmployeeAdapter employeeAdapter;
    SearchView.OnQueryTextListener onQueryTextListener = new SearchView.OnQueryTextListener() {
        @Override
        public boolean onQueryTextSubmit(String query) {
            return false;
        }

        @Override
        public boolean onQueryTextChange(String newText) {
            if (!TextUtils.isEmpty(newText)) {
                employeeAdapter.getFilter().filter(newText);
                return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchview = (SearchView) findViewById(R.id.search_em);

        findviewByID();

        getEmployee();
    }

    private void findviewByID() {
        recyclerView = (RecyclerView) findViewById(R.id.main_rv);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
    }

    public void getEmployee() {
        WSController wsController = RestAppController.getRetrofitinstance().create(WSController.class);
        Call<WSModel> call = wsController.getEmployee(API_ENDPOINT, EMPLOYEE);
        call.enqueue(new Callback<WSModel>() {
            @Override
            public void onResponse(Call<WSModel> call, Response<WSModel> response) {
                if (response.isSuccessful()) {
                    Log.d(REST_LOG, " @REST:Success " + response.body());

                    WSModel wsmodel = response.body();
                    ArrayList<EmployeeVO> employeeVOs = wsmodel.getEmployee();

                    employeeAdapter = new EmployeeAdapter(MainActivity.this, employeeVOs);
                    recyclerView.setAdapter(employeeAdapter);
                    searchview.setOnQueryTextListener(onQueryTextListener);
                }
            }

            @Override
            public void onFailure(Call<WSModel> call, Throwable t) {
                Log.d(REST_LOG, " @REST:Failure " + t.getMessage());
            }
        });
    }
}
