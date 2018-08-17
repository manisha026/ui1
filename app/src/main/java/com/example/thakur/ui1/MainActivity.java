package com.example.thakur.ui1;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Fragment fragment_recycler;
    ArrayList<ModelClass> data=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          recyclerView=findViewById(R.id.recycler_View);
//        fragment_recycler=findViewById(R.id.fragmentRecycler);
//        fragment_recycler=findViewById(R.id.fragment_recycler);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        ModelClass modelClass=new ModelClass();
        ModelClass modelClass1=new ModelClass();
        ModelClass modelClass2=new ModelClass();
        ModelClass modelClass3=new ModelClass();
        ModelClass modelClass4=new ModelClass();
        ModelClass modelClass5=new ModelClass();
        ModelClass modelClass6=new ModelClass();
        ModelClass modelClass7=new ModelClass();
        ModelClass modelClass8=new ModelClass();
        ModelClass modelClass9=new ModelClass();
        ModelClass modelClass10=new ModelClass();
        ModelClass modelClass11=new ModelClass();

        modelClass.setName("Jennifer");
        modelClass.setUi_ux("UI/UX");
        modelClass.setChandigarh("Chandigarh,INDIA");
        modelClass.setExperience("Experience 2+ Years");
        modelClass.setFace(R.drawable.pp1);
        modelClass.setAdd(R.drawable.add);
        modelClass.setContact(R.drawable.call);
        modelClass.setMessage(R.drawable.message);

        modelClass1.setName("Shaman");
        modelClass1.setUi_ux("UI/UX");
        modelClass1.setChandigarh("Chandigarh,INDIA");
        modelClass1.setExperience("Experience 3+ Years");
        modelClass1.setFace(R.drawable.pp2);
        modelClass1.setAdd(R.drawable.add);
        modelClass1.setContact(R.drawable.call);
        modelClass1.setMessage(R.drawable.message);

        modelClass2.setName("Jennifer");
        modelClass2.setUi_ux("UI/UX");
        modelClass2.setChandigarh("Chandigarh,INDIA");
        modelClass2.setExperience("Experience 2+ Years");
        modelClass2.setFace(R.drawable.pp1);
        modelClass2.setAdd(R.drawable.add);
        modelClass2.setContact(R.drawable.call);
        modelClass2.setMessage(R.drawable.message);

        modelClass3.setName("Shaman");
        modelClass3.setUi_ux("UI/UX");
        modelClass3.setChandigarh("Chandigarh,INDIA");
        modelClass3.setExperience("Experience 3+ Years");
        modelClass3.setFace(R.drawable.pp2);
        modelClass3.setAdd(R.drawable.add);
        modelClass3.setContact(R.drawable.call);
        modelClass3.setMessage(R.drawable.message);

        modelClass4.setName("Jennifer");
        modelClass4.setUi_ux("UI/UX");
        modelClass4.setChandigarh("Chandigarh,INDIA");
        modelClass4.setExperience("Experience 2+ Years");
        modelClass4.setFace(R.drawable.pp1);
        modelClass4.setAdd(R.drawable.add);
        modelClass4.setContact(R.drawable.call);
        modelClass4.setMessage(R.drawable.message);

        modelClass5.setName("Shaman");
        modelClass5.setUi_ux("UI/UX");
        modelClass5.setChandigarh("Chandigarh,INDIA");
        modelClass5.setExperience("Experience 3+ Years");
        modelClass5.setFace(R.drawable.pp2);
        modelClass5.setAdd(R.drawable.add);
        modelClass5.setContact(R.drawable.call);
        modelClass5.setMessage(R.drawable.message);

        modelClass6.setName("Jennifer");
        modelClass6.setUi_ux("UI/UX");
        modelClass6.setChandigarh("Chandigarh,INDIA");
        modelClass6.setExperience("Experience 2+ Years");
        modelClass6.setFace(R.drawable.pp1);
        modelClass6.setAdd(R.drawable.add);
        modelClass6.setContact(R.drawable.call);
        modelClass6.setMessage(R.drawable.message);

        modelClass7.setName("Shaman");
        modelClass7.setUi_ux("UI/UX");
        modelClass7.setChandigarh("Chandigarh,INDIA");
        modelClass7.setExperience("Experience 3+ Years");
        modelClass7.setFace(R.drawable.pp2);
        modelClass7.setAdd(R.drawable.add);
        modelClass7.setContact(R.drawable.call);
        modelClass7.setMessage(R.drawable.message);

        modelClass8.setName("Jennifer");
        modelClass8.setUi_ux("UI/UX");
        modelClass8.setChandigarh("Chandigarh,INDIA");
        modelClass8.setExperience("Experience 2+ Years");
        modelClass8.setFace(R.drawable.pp1);
        modelClass8.setAdd(R.drawable.add);
        modelClass8.setContact(R.drawable.call);
        modelClass8.setMessage(R.drawable.message);

        modelClass9.setName("Shaman");
        modelClass9.setUi_ux("UI/UX");
        modelClass9.setChandigarh("Chandigarh,INDIA");
        modelClass9.setExperience("Experience 3+ Years");
        modelClass9.setFace(R.drawable.pp2);
        modelClass9.setAdd(R.drawable.add);
        modelClass9.setContact(R.drawable.call);
        modelClass9.setMessage(R.drawable.message);

        modelClass10.setName("Jennifer");
        modelClass10.setUi_ux("UI/UX");
        modelClass10.setChandigarh("Chandigarh,INDIA");
        modelClass10.setExperience("Experience 2+ Years");
        modelClass10.setFace(R.drawable.pp1);
        modelClass10.setAdd(R.drawable.add);
        modelClass10.setContact(R.drawable.call);
        modelClass10.setMessage(R.drawable.message);

        modelClass11.setName("Shaman");
        modelClass11.setUi_ux("UI/UX");
        modelClass11.setChandigarh("Chandigarh,INDIA");
        modelClass11.setExperience("Experience 3+ Years");
        modelClass11.setFace(R.drawable.pp2);
        modelClass11.setAdd(R.drawable.add);
        modelClass11.setContact(R.drawable.call);
        modelClass11.setMessage(R.drawable.message);


        data.add(modelClass);
        data.add(modelClass1);
        data.add(modelClass2);
        data.add(modelClass3);
        data.add(modelClass4);
        data.add(modelClass5);
        data.add(modelClass6);
        data.add(modelClass7);
        data.add(modelClass8);
        data.add(modelClass9);
        data.add(modelClass10);
        data.add(modelClass11);


        DemoAdapter demoAdapter=new DemoAdapter(MainActivity.this,data);
        recyclerView.setAdapter(demoAdapter);

    }
}
