package com.halty.poemanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String poem = "У лукоморья дуб зеленый;\nЗлатая цепь на дубе том:\nИ днем и ночью кот ученый\nВсе ходит по цепи кругом;\n" +
            "Идет направо — песнь заводит,\nНалево — сказку говорит.\nТам чудеса: там леший бродит,\nРусалка на ветвях сидит;\n" +
            "Там на неведомых дорожках\nСледы невиданных зверей;\nИзбушка там на курьих ножках\nСтоит без окон, без дверей;\n" +
            "Там лес и дол видений полны;\nТам о заре прихлынут волны\nНа брег песчаный и пустой,\nИ тридцать витязей прекрасных\n" +
            "Чредой из вод выходят ясных,\nИ с ними дядька их морской;\nТам королевич мимоходом\nПленяет грозного царя;\n" +
            "Там в облаках перед народом\nЧерез леса, через моря\nКолдун несет богатыря;\nВ темнице там царевна тужит,\n" +
            "А бурый волк ей верно служит;\nТам ступа с Бабою Ягой\nИдет, бредет сама собой,\nТам царь Кащей над златом чахнет;\n" +
            "Там русский дух… там Русью пахнет!\nИ там я был, и мед я пил;\nУ моря видел дуб зеленый;\nПод ним сидел, и кот ученый\n" +
            "Свои мне сказки говорил.";
    private List<String> poemArray;
    // Вывести на экран - самое длинное слово, самое короткое, общее количество букв, все слова в отсортированном порядке
    private TextView resultText;
    private TextView sortedWords;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultText = findViewById(R.id.resultText);
        sortedWords = findViewById(R.id.sortedWords);

        poemArray = Util.getTextArray(poem);
        analyzePoem();
    }

    private void analyzePoem() {
        String longestWord = Util.findLongestWord(poemArray);
        String shortestWord = Util.findShortestWord(poemArray);
        int letterAmount = Util.findLetterAmount(poemArray);
        String sortedPoem = Util.sortText(poemArray);

        resultText.append("Самое большое слово: " + longestWord + ", длинной в " + longestWord.length() + " букв\n");
        resultText.append("Самое маленькое слово: " + shortestWord + ", длинной в " + shortestWord.length() + " букв\n");
        resultText.append("Количество букв в отрывке: " + letterAmount + " букв.");
        sortedWords.setText(sortedPoem);
    }


}