package ru.comdcomp.helloworldlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnCalc);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //ассоциируем конкретный объект, конкретную переменную с элементом управления
                EditText editPrice = findViewById(R.id.editPrice);
                EditText editDiscount = findViewById(R.id.editDiscount);

                //получаем данные из текстовых полей
                String price = editPrice.getText().toString();
                String  discount= editDiscount.getText().toString();

                //переводим текстовые данные в числа
                Integer priceParse = Integer.parseInt(price);
                Integer discountParse = Integer.parseInt(discount);

                //ассоциируем поле для вывода результата с переменной в коде
                TextView result = findViewById(R.id.txtResult);

                //считаем результат
                Double resultCalc = priceParse*1.0-priceParse*1.0/100*discountParse;

                //получаем строку из ресурсов для результата
                String resultText = getString(R.string.txtResult);

                //выводим результат в форму
                result.setText(resultText+" "+resultCalc.toString());


            }
        });
    }
}
