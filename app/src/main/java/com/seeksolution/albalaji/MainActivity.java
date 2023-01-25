package com.seeksolution.albalaji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.seeksolution.albalaji.Adpaters.LockUpAdapter;
import com.seeksolution.albalaji.Adpaters.MoviesAdapter;
import com.seeksolution.albalaji.Adpaters.NewsAdapter;
import com.seeksolution.albalaji.Adpaters.OriginalAdapter;
import com.seeksolution.albalaji.Adpaters.RecommendedAdapter;
import com.seeksolution.albalaji.Adpaters.TrandingRecylerAdapter;
import com.seeksolution.albalaji.models.LockUpModual;
import com.seeksolution.albalaji.models.MoviesModual;
import com.seeksolution.albalaji.models.NewsModel;
import com.seeksolution.albalaji.models.OriginalModual;
import com.seeksolution.albalaji.models.RecommendModel;
import com.seeksolution.albalaji.models.TrandingModels;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView,recyclerView2,recyclerView3,recyclerView4,recyclerView5,recyclerView6;
    LinearLayoutManager Horizontal, Horizontal2, Horizontal3, Horizontal4, Horizontal5,Horizontal6 ;

    ArrayList<TrandingModels> TrandingModels_arr=new ArrayList<>();
    ArrayList<OriginalModual> Original_arr=new ArrayList<>();
    ArrayList<RecommendModel> Recommend_arr=new ArrayList<>();
    ArrayList<NewsModel>News_arr=new ArrayList<>();
    ArrayList<LockUpModual>LockUp_arr=new ArrayList<>();
    ArrayList<MoviesModual>Movies_arr=new ArrayList<>();
    private String[] TrendingUrals={
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/2387/1452387-v-e9e11947b44a",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/1158/1451158-v-60ae0c6f2c82",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/5421/1445421-v-06772ee1734c",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/1970/1441970-v-574d1988c10a",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/6479/1436479-v-3bd70e9e2b4d",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/4156/1434156-v-f44a741e0902",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/9226/1389226-v-8f96db1fe315",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/5052/1405052-v-2063bab41935",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/1191/1451191-v-081c06caea3e",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/9477/1429477-v-4c6f37f48b10",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/5052/1405052-v-2063bab41935",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/9264/1319264-v-0bd71e83df13",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/4452/1444452-v-aff8aea93f8e",

    };
    private String[] OriginalUrals={
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_hs_3x/sources/r1/cms/prod/3930/1453930-h-23f4a45604a4",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_hs_3x/sources/r1/cms/prod/3907/1453907-h-a357379fdf62",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_hs_3x/sources/r1/cms/prod/3338/1453338-h-80cd8b92cf1d",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_hs_3x/sources/r1/cms/prod/3919/1453919-h-43d78301e521",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_hs_3x/sources/r1/cms/prod/3902/1453902-h-ec4f5d846be3",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_hs_3x/sources/r1/cms/prod/3905/1453905-h-be99863fa041",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/1970/1441970-v-574d1988c10a",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/6594/1446594-v-8ccc26ba3e66",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_hs_3x/sources/r1/cms/prod/4148/1454148-h-a47dc3ec3f29",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_hs_3x/sources/r1/cms/prod/3586/1453586-h-fe143f62e664",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_hs_3x/sources/r1/cms/prod/3740/1453740-h-cec23eabd2f9",

    };
    private String[] RecomendUrals={
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/4249/1364249-v-2e30b93b7bb5",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/4253/1364253-v-17a2ff74143c",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/5421/1445421-v-06772ee1734c",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/4267/1364267-v-59ed5cfdea3a",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/4255/1364255-v-7d13c9d136b5",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/2387/1452387-v-e9e11947b44a",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/5362/1395362-v-f8d73be7dd01",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/7721/847721-v",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/1191/1451191-v-081c06caea3e",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/5682/1415682-v-79a200913aca",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/1248/1431248-v-af62a54a6d8d",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/4259/1364259-v-fe5f361f4eae",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/1970/1441970-v-574d1988c10a",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/6594/1446594-v-8ccc26ba3e66",
//commit check

    };

    private String[] NewsUrals={
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/6536/846536-v",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/9219/1389219-v-9752e6e5bb92",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/9226/1389226-v-8f96db1fe315",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/5052/1405052-v-2063bab41935",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/1191/1451191-v-081c06caea3e",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/5682/1415682-v-79a200913aca",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/1248/1431248-v-af62a54a6d8d",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/3669/593669-v",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/9233/1389233-v-9aaacc3bf07f",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/8285/388285-v",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/2213/1042213-v-1416e8e25397",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/6923/1106923-v-adeedbf81e6c",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/1258/1431258-v-bfcf814b38fd",


    };
    private String[] LockupUrals={
             "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/9239/1389239-v-b354c74533f6",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/6699/1026699-v-cb786ee970de",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/9233/1389233-v-9aaacc3bf07f",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/5052/1405052-v-2063bab41935",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/1191/1451191-v-081c06caea3e",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/5002/705002-v",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/3096/1103096-v-4914be909f49",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/4253/1364253-v-17a2ff74143c",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/2213/1042213-v-1416e8e25397",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/6923/1106923-v-adeedbf81e6c",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/2876/862876-v",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/1839/1451839-v-c96205102717",

    };
    private String[] MoviesUrals={
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/928/1360928-v-b808273e5b54",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/457/30457-v",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/375/1350375-v-108376acc65b",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/372/1420372-v-c4dc9b7e307f",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/1158/1451158-v-60ae0c6f2c82",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/4259/1364259-v-fe5f361f4eae",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/1970/1441970-v-574d1988c10a",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/6699/1026699-v-cb786ee970de",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/3434/1373434-v-509c9dbd22dc",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/9477/1429477-v-4c6f37f48b10",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/5052/1405052-v-2063bab41935",


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView) findViewById(R.id.Recycler_view);
        recyclerView2=(RecyclerView)findViewById(R.id.Recycler_view2);
        recyclerView3=(RecyclerView)findViewById(R.id.Recycler_view3);
        recyclerView4=(RecyclerView)findViewById(R.id.Recycler_view4);
        recyclerView5=(RecyclerView)findViewById(R.id.Recycler_view5);
        recyclerView6=(RecyclerView)findViewById(R.id.Recycler_view6);



        for(int i=0;i<TrendingUrals.length;i++){
            TrandingModels_arr.add(new TrandingModels(TrendingUrals[i]));

        }
        for(int i=0;i<OriginalUrals.length;i++){

            Original_arr.add(new OriginalModual(OriginalUrals[i]));

        }
        for(int i=0;i<RecomendUrals.length;i++){

            Recommend_arr.add(new RecommendModel(RecomendUrals[i]));

        }

        for(int i=0;i<NewsUrals.length;i++){
            News_arr.add(new NewsModel(NewsUrals[i]));

        }
        for(int i=0;i<LockupUrals.length;i++){

            LockUp_arr.add(new LockUpModual(LockupUrals[i]));

        }
        for(int i=0;i<MoviesUrals.length;i++){

            Movies_arr.add(new MoviesModual(MoviesUrals[i]));

        }


        Horizontal=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(Horizontal);
        TrandingRecylerAdapter adapter=new TrandingRecylerAdapter(getApplicationContext(),TrandingModels_arr);
        recyclerView.setAdapter(adapter);


        Horizontal2=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(Horizontal2);
        OriginalAdapter adapter1=new OriginalAdapter(getApplicationContext(),Original_arr);
        recyclerView2.setAdapter(adapter1);

        Horizontal3=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView3.setLayoutManager(Horizontal3);
        RecommendedAdapter adapter2=new RecommendedAdapter(getApplicationContext(),Recommend_arr);
        recyclerView3.setAdapter(adapter2);

        Horizontal4=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView4.setLayoutManager(Horizontal4);
        NewsAdapter adapter3=new NewsAdapter(getApplicationContext(),News_arr);
        recyclerView4.setAdapter(adapter3);

        Horizontal5=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView5.setLayoutManager(Horizontal5);
        LockUpAdapter adapter4=new LockUpAdapter(getApplicationContext(),LockUp_arr);
        recyclerView5.setAdapter(adapter4);

        Horizontal6=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView6.setLayoutManager(Horizontal6);
        MoviesAdapter adapter5=new MoviesAdapter(Movies_arr,getApplicationContext());
        recyclerView6.setAdapter(adapter5);







    }
}