package com.xroottool.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.IOException;
import dev.shreyaspatil.MaterialDialog.MaterialDialog;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(view -> {
            try {
                Runtime.getRuntime().exec("su");
                Toast.makeText(MainActivity.this, "Congratulations!! Your Device Is Rooted", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(MainActivity.this, "Your Device Isn't Rooted", Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }

        });
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(view -> {
            MaterialDialog btn21 = new MaterialDialog.Builder(MainActivity .this)
                    .setTitle("Reboot")
                    .setMessage("Do you want to reboot your Phone?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", R.drawable.ic_ok, (MaterialDialog.OnClickListener) (dialogInterface, which) -> {
                        try {
                            Runtime.getRuntime().exec("su -c /system/bin/reboot");
                        } catch (IOException e) {
                            Toast.makeText(MainActivity.this, "Root Your Device First", Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                            dialogInterface.dismiss();
                        }
                    })
                    .setNegativeButton("Cancel", R.drawable.ic_close_24, (MaterialDialog.OnClickListener) (dialogInterface, which) -> dialogInterface.dismiss())
                    .build();

            btn21.show();

        });
        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(view -> {
            MaterialDialog btn31 = new MaterialDialog.Builder(MainActivity .this)
                    .setTitle("Reboot to Recovery")
                    .setMessage("Do you want to reboot to Recovery?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", R.drawable.ic_ok, (MaterialDialog.OnClickListener) (dialogInterface, which) -> {
                        try {
                            Runtime.getRuntime().exec("su -c /system/bin/reboot recovery");
                        } catch (IOException e) {
                            Toast.makeText(MainActivity.this, "Root Your Device First", Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                            dialogInterface.dismiss();
                        }
                    })
                    .setNegativeButton("Cancel", R.drawable.ic_close_24, (MaterialDialog.OnClickListener) (dialogInterface, which) -> dialogInterface.dismiss())
                    .build();

            btn31.show();




        });
        Button btn4= findViewById(R.id.btn4);
        btn4.setOnClickListener(view -> {
            MaterialDialog btn41 = new MaterialDialog.Builder(MainActivity .this)
                    .setTitle("Reboot to Bootloader")
                    .setMessage("Do you want to reboot to Bootloader?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", R.drawable.ic_ok, (MaterialDialog.OnClickListener) (dialogInterface, which) -> {
                        try {
                            Runtime.getRuntime().exec("su -c /system/bin/reboot bootloader");
                        } catch (IOException e) {
                            Toast.makeText(MainActivity.this, "Root Your Device First", Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                            dialogInterface.dismiss();
                        }
                    })
                    .setNegativeButton("Cancel", R.drawable.ic_close_24, (MaterialDialog.OnClickListener) (dialogInterface, which) -> dialogInterface.dismiss())
                    .build();

            btn41.show();
        });
        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(view -> {
            MaterialDialog btn51 = new MaterialDialog.Builder(MainActivity .this)
                    .setTitle("Reboot to Edl")
                    .setMessage("Do you want to reboot to Edl?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", R.drawable.ic_ok, (MaterialDialog.OnClickListener) (dialogInterface, which) -> {
                        try {
                            Runtime.getRuntime().exec("su -c /system/bin/reboot edl");
                        } catch (IOException e) {
                            Toast.makeText(MainActivity.this, "Root Your Device First", Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                            dialogInterface.dismiss();
                        }
                    })
                    .setNegativeButton("Cancel", R.drawable.ic_close_24, (MaterialDialog.OnClickListener) (dialogInterface, which) -> dialogInterface.dismiss())
                    .build();

            btn51.show();


        });
    }
}