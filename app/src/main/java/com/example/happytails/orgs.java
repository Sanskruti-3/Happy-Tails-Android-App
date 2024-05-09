package com.example.happytails;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class orgs extends AppCompatActivity {
    ListView list;
    String []name={"Posh Foundation","Friendicoes SECA","Red Paws Rescue","PETA","Kannan Animal Welfare"};
    String []about={"POSH FOUNDATION is a Delhi NCR based NGO actively involved in Animal welfare and awareness related issues ,registered under Trust as on April 07,2014. Our goal is to give the gift of life to as many street animals as humanely possible, enrich the lives of those who adopt them, and in doing so, help create a better world.",
    "Friendicoes SECA (Society for the Eradication of Cruelty to Animals) is a Registered non-profit Charity (Registration no. 10188 under the Societies Registration Act 1860). Friendicoes SECA is now 44 years old (date of registration: April 23, 1979) and has been providing medical help and shelter for the animals of Delhi city and its environs, as well as Gurugram and other districts of Haryana,  since then.",
    "The aims and purposes of Red Paws Rescue include finding homes for Indian dogs and pups, placing abandoned pets into loving homes, mass sterilizations of stray animals in different zones across New Delhi., better medical care and to raise awareness to our cause.",
    "People for the Ethical Treatment of Animals (PETA) entities have more than 9 million members and supporters globally, and PETA U.S. is the largest animal rights organization in the world. PETA focuses its attention on the four areas in which the largest numbers of animals suffer the most intensely for the longest periods of time: in laboratories, in the food industry, in the clothing trade, and in the entertainment industry. ",
    "Kannan Animal Welfare is a Section 8 Non-Profit Company that focuses primarily on the rescue and treatment of severely injured stray animals in and around the Delhi-NCR region. They run a shelter in Noida and also focus on initiatives such as sterilization, feeding of strays, and rehoming of rescued animals"};
    String []website={"http://www.poshfoundation.in","https://friendicoes.org/","http://www.redpawsrescue.com/index.htm","http://www.peta.org" ,
            "http://kannananimalwelfare.org"};
    String[] industry={"Veterinary","Non-profit Organization Management","Veterinary Services","Non-profit Organizations","Civic and Social Organizations"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orgs);
        list=findViewById(R.id.ll);
        ArrayAdapter ad=new ArrayAdapter(this, android.R.layout.simple_list_item_1,name);
        list.setAdapter(ad);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(orgs.this,orgsinfo.class);
                intent.putExtra("name",name[position]);
                intent.putExtra("about",about[position]);
                intent.putExtra("website",website[position]);
                intent.putExtra("industry",industry[position]);

                int im1,im2,im3,im4;
                if(position==0)
                {
                    im1=R.drawable.o1;
                    im2=R.drawable.o2;
                    im3=R.drawable.o3;
                    im4=R.drawable.o4;
                }
                else if(position==1)
                {
                    im1=R.drawable.f1;
                    im2=R.drawable.f2;
                    im3=R.drawable.f3;
                    im4=R.drawable.f4;
                }
                else if(position==2)
                {
                    im1=R.drawable.r1;
                    im2=R.drawable.r2;
                    im3=R.drawable.r3;
                    im4=R.drawable.r4;
                }
                else if(position==3)
                {
                    im1=R.drawable.p1;
                    im2=R.drawable.p2;
                    im3=R.drawable.p3;
                    im4=R.drawable.p4;
                }
                else
                {
                    im1=R.drawable.k1;
                    im2=R.drawable.k2;
                    im3=R.drawable.k3;
                    im4=R.drawable.k4;
                }

                intent.putExtra("im1",im1);
                intent.putExtra("im2",im2);
                intent.putExtra("im3",im3);
                intent.putExtra("im4",im4);
                startActivity(intent);
            }
        });

    }
}
