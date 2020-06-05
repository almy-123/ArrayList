package sg.edu.rp.c346.id19037610.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tvContent);
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");
        String theFruit = fruits.get(1);
        String out = "";
        fruits.remove(0);
        fruits.set(fruits.size()-1, "dragon fruit");

        if(fruits.size()!=0){
            out+="Fruits";
            out+="\n=====";

            for(int i=0;i<fruits.size();i++){
                out+="\n"+fruits.get(i);
            }
        }
        tv.setText(out);
    }
}
