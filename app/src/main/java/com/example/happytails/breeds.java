package com.example.happytails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class breeds extends AppCompatActivity {
    ListView listview;
    String[] arr ={"Beagle","French Bulldog","German Spitz Klein","German Pinscher","German Shepherd","Havanese","Japanese Shiba Inu","Maltese","Papillon"
    ,"Siberian Husky","Polish Lowland Sheepdog","Pug","Pointer","Portugese Pointer","Welsh Corgi(Pembroke)","Poodle"};
    String[] span ={"12-15","11-14","14-16","12-14","9-13","13-15","12-15","12-15","12-14","12-15","12-15","12-15","12-17","12-14","12-15","12-15"};
    String[] wt ={"10-11","7.5-12.5","8-10","11-16","22-40","3-6","6.8-11","2-4","3-5","16-27","18-20","6.3-8.1","26-30","16-27","9-12","20-30"};
    String[] ht ={"33-40","30-31","23-29","43-48","58-63","23-28","33-43","20-25","20-28","51-60","42-50","25-33","61-69","50-58","25-30","38-45"};
    String[] size ={"Medium","Small","Small","Medium","Large","Small","Medium","Small","Small","Medium","Medium","Small","Medium","Medium","Small","Large"};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breeds);
        listview=findViewById(R.id.listView);
        ArrayAdapter ad=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        listview.setAdapter(ad);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(breeds.this, breedinfo.class);
                intent.putExtra("position",position);
                intent.putExtra("span",span[position]);
                intent.putExtra("wt",wt[position]);
                intent.putExtra("ht",ht[position]);
                intent.putExtra("size",size[position]);
                intent.putExtra("arr",arr[position]);

                int imgR;
                switch(position)
                {
                    case 0:
                        imgR=R.drawable.dog0;
                        break;
                    case 1:
                        imgR=R.drawable.dog1;
                        break;
                    case 2:
                        imgR=R.drawable.dog3;
                        break;
                    case 3:
                        imgR=R.drawable.dog4;
                        break;
                    case 4:
                        imgR=R.drawable.dog5;
                        break;
                    case 5:
                        imgR=R.drawable.dog6;
                        break;
                    case 6:
                        imgR= R.drawable.dog7;
                        break;
                    case 7:
                        imgR= R.drawable.dog8;
                        break;
                    case 8:
                        imgR= R.drawable.dog9;
                        break;
                    case 9:
                        imgR= R.drawable.dog10;
                        break;
                    case 10:
                        imgR= R.drawable.dog11;
                        break;
                    case 11:
                        imgR= R.drawable.dog12;
                        break;
                    case 12:
                        imgR= R.drawable.dog13;
                        break;
                    case 13:
                        imgR= R.drawable.dog14;
                        break;
                    case 14:
                        imgR= R.drawable.dog15;
                        break;
                    case 15:
                        imgR=R.drawable.dog16;
                        break;
                    default:
                        imgR=R.drawable.dog;

                }
                intent.putExtra("imgR",imgR);
                startActivity(intent);
            }
        });
    }
}