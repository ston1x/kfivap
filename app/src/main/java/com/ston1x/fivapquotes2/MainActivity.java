package com.ston1x.fivapquotes2;

import android.content.ClipData;

import com.ston1x.fivapquotes2.R;
//import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.text.ClipboardManager;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.content.ClipboardManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

//import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.*;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ImageButton imageButton;
    private Random gen = new Random();
    private String toCopy;
    private Button CopyButton;
    private TextView textView2;
   // private InterstitialAd mInterstitialAd;

    ArrayList<String> quotes = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {



    


        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

            quotes.add("Еду в маршрутке хз куда и откуда");
            quotes.add("Ночь блять или че дауны не знаете говно вращается планеты Галилео Александр пушной говорил пиздец как не знать что такое ночь....");
            quotes.add("Сука я на турнир ходил где твою мать ебали я выиграл");
            quotes.add("Супер качнулся но ебано средне");
            quotes.add("Ок ебать понятно в интернете крутые а в реальной жизни язык в жопу засунули при встрече");
            quotes.add("Сука спам пидарас ебанат еблодей еблантий хуисос далбонавт ебонат очко школоты чьмо пизда пидераста пиздамёт соси хуйййй");
            quotes.add("Да согл сила масса интеллект но минус то что не качался 4,5 недели и мышцы слил");
            quotes.add("И еще идея чтобы можно было заряжать айпад и айфон через очко рот или подмыху за счет тепла тк внутри человека теплее");
            quotes.add("Кстати думаю хули где норм мемы со мной то наебки какие то то алахи а надо ржачку бы");
            quotes.add("Ща пожрал шашлык ок занят мясо тестостерон");
            quotes.add("Ебать ща похавал имбирь ебать я огнедышащий изо рта как годзилла");
            quotes.add("а прикол мне так говорят я захожу типо ку я опоздал училка такая выйди и войди нормально а такой ОТСОСИ ПОТОМ ПРОСИ");
            quotes.add("Ага бля мразь хули сказала хуйня держи свое мнение вместе с говном у себя во рту что то бля зашел к тебе на страницу ты анорексия ебаная + паблики веб панк тамблер и приколы для даунов ты говна не стоишь");
            quotes.add("Ебать пацан псих ебнутый сумасшедший");
            quotes.add("пизда но пох");
            quotes.add("Ку го лайки");
            quotes.add("Да пизда ебаллллллллллл ээээ ууууу. Блля нах"); //17
            quotes.add("Гром гремит кусты трясутся что там делают Ебутся ты не порти мой рассказ здесь работает спецназ!");
            quotes.add("Сука пиздоглазый хули не нравится ебало затяни и не читай конфу старее 5 минут а не обсирание");
            quotes.add("Ты мразь ублюдок зацени мои мышцы хуйло за компом ты как немец ты сука пиздишь из далека тварь тупая разанчина");
            quotes.add("Podпиshisь on май инстаgramm \nhttps://instagram.com/kfivap/ ");
            quotes.add("Токо за деньги 40 sorok сорок тысяч рублей");
            quotes.add("Вы все говорите что качки тупые и те кто обсирает меня они не сильные но зато умные. А теперь вопрос а где ваш интеллект? В том что в школоло учитесь на 4-5 или то что подписаны на пабосы умные факты? Нет. Чтобы заявлять что вы умнее сделайте научное открытие, станьте хотя бы номинантом на нобелевскую премию, тогда можете говорить что я тупой качек. А пока вы не добились в науке хотя бы среднего уровня не открывайте свой ебучий рот на меня и радуйтесь что вы не из моего города");
            quotes.add("Послушайте песню bounce bitch magnit edit мегакайфуха я знаю ее 1 половины 2014 и все время кайфую вон гасет вон гасет пипа тутепейд вотинг норпаста квеста ка ка ка ке ке ахвлвлкоаалу керге пон понен е гасте вон вон банс бич банс бич");
            quotes.add("Ща лежу песню слушаю ай кент андестенд ю кент андестенд");
            quotes.add("Ку че дум конфы из вилсы 1 эквб админ не лох кайф чел респект 2 капитанусия админ капит анус гондон еблондонйд 3 конфа голубя лох говно гондон 4 трембачевщина адм коля трембачев сын собаки");
            quotes.add("Прикол седня угарали в школе я же качек я говорю кенту го в качалку я тя прокачаю и бля понял что по пидорски звучит начали ржачь училка пиздит хули смеетесь а мы соси жепу дура у нас мемная вечеринка");
            quotes.add("Жалко что нельзя телепортироваться в экран и набить ебасос собеседнику но я бы не только для этого сделал а еще бы погулять и поугарать с кайфовыми челами никол стоян эмин куп и другие");
            quotes.add("Нейтр но помните я мозговой чел а вы ебло с кошечками");
            quotes.add("Меня кент кинул короче и думал что я ебало бить буду позвал друзей типо что меня топлой пиздить а я увел у него телку с которой он встречался 4+ года и те кто пиздить меня собрались сказали респект ты интеллектуал а не бык тупо пиздящий и тот лох кидок соснул");
            quotes.add("Не мне пох я не собир ниче доказывать но помните я говорю правду или вообще молчу"); //31
            quotes.add("хуй я те доказ. еще буду sosi это тебе не урок гиометррии теоремы ебучьи доказ)))");
            quotes.add("Кстати я фейк лунева если че вы думаете вы меня тролили все время а это я троллил вас😄😄😄😄😄😄😄😄 С основы зайду подтвержу");
            quotes.add("Ух ебать мощный ветер снег в ебло");
            quotes.add("У тебя нет мозгов точнее есть но это горох");
            quotes.add("Хд нихуя она сука фашистка чмо ебучее она как не фашистка а как немецкий ветеран бля нах пиздрила");
            quotes.add("Пизда бля нах кик его пишем ларьку а он хуй ебется в глаза и пох ему");
            quotes.add("Сила в силе кто самый сильный тот и пишет историю это я придумал");
            quotes.add("Ща прикол придумал а твоя мамка случайно не медуза горгона а то от ее взгляда мой член каменет");
            quotes.add("Ты охуел на украину охуел пидарас пидарас пидарас");
            quotes.add("Я бляддддд сука нах вставал с дивана костью голени центром ебнул со всей силы по табуретки больно\nУдар в саму кость пошел");
            quotes.add("Иди нахуй анус свой пруфни целка сойка заебешься");
            quotes.add("Если боишься перекачаться помни что ты никогда не накачаешься");
            quotes.add("Кстати когда человек пиздит словами а мне не нравится я говорю смотрите говорящее очко");
            quotes.add("Ку я тут уууу бля агууууу гав гав мяу кокококо");
            quotes.add("ты хуй собачий на блюде с подливой");
            quotes.add("Пидорассссссссс охуел чмо ебало бить буду");
            quotes.add("Никита Лобушкин охуел почини я сру ща и не грузит делать нечего");
            quotes.add("Кайф паблик но минусы только в будующем вижу вы бля нах можете охуеть и кидать он моего лица типо я пидорас сосу хуй пидорасам люблю фистинг\nСука за такое ебало бить буду жестко я не пидорас Я НАТУРАЛ ЕБАТЬ НАХ СОСИте но это заметка на будущее");
            quotes.add("Настоящий умный человек не будет заявлять что он умный"); //50
            quotes.add("Мне пох долбоебы дистрофики не бесите меня я бы всем ебло набил");
            quotes.add("Пидорас чмырь марводи ебаный объебщик людей сука");
            quotes.add("Сука целка из рязани лох бесиш верни в конфу рен пидорасссс и админ лох хули делает уебать бы этомум соску волосатому с ноги бойся мегя");

            //added in new version
            quotes.add("Соси сосал сосло ебачие");
            quotes.add("Че нехуя сказать сопле выебанная?");
            quotes.add("Ты говно нулевое пон соси ебан олень");
            quotes.add("Бля смотрю ботинки 1000 рублей думаю нормальные пиздатые а они сука ахаахха женские 43 размер макс");
            quotes.add("И еще кент рассказывает прикол типо как едят русские и ржет бля там пиздец опять весь стол заблевал едой ебать русские + угар про днюху рассказывал уже");
            quotes.add("Ща сижу в столовой с телками кажется одну я в порнухе видел");
            quotes.add("Ебать 7 лайков минуту назад выложил \n Вот что куголайки делают");
            quotes.add("С днюхой успехов тебе, счастья, чтоб тебя ебали 5 чурок в очко сразу пидорас ты бля уебок ты хули пиздел на меня год назад я помню все тебя бля вообще битой надо пиздить, любви, здоровья, денег");
            quotes.add("Ахуеть видел нах член летающий ебать нло лунева");
            quotes.add("Не надо сидеть за компом по 12 часов в день лучше сходить в качалку и сидеть за компом 10 часов в день");
            quotes.add("Сука ебать в гта на великах с горы первую гонку норм прошел а вторую сука хуй ебать ебал а потом психанул бля закрыл игру и музон и заорал на хуй на весь нижний новгород СУКАААААААА ЕБАНЫЫЫЫЫЫЫЫЙ РООООООООООТ");
            quotes.add("Бля угар вспомнил ссу в москве на гараж чоп выходит типо нельзя штраф а я такой доссываю и говорю а есть доказательства он чето язык в жопу засунул мямлит а я говорю это дождь был и ушел угар\n Ок еду занят");



        textView = (TextView) findViewById(R.id.textView);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        CopyButton = (Button) findViewById(R.id.button);
        textView2 = (TextView) findViewById(R.id.textView2);

        textView.setMovementMethod(new ScrollingMovementMethod());
    }


   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu_main, menu);
       return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){

            case R.id.action_share:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, textView.getText() + "\nСкопировано из приложения \"Цитаты Фывапа\"");
                sendIntent.setType("text/plain");

                startActivity(sendIntent);

                break;

            case R.id.action_biography:
            // Биография Фывапа
                startActivity(new Intent(MainActivity.this,BioActivity.class));
              //  Toast.makeText(MainActivity.this, getString(R.string.action_settings), Toast.LENGTH_LONG).show();
                    break;

            case R.id.action_donate:
            startActivity(new Intent(MainActivity.this,DonateActivity.class));
                break;

            case R.id.action_stickers:
                Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.telegram.me/addstickers/kfivap"));
                startActivity(browserIntent1);
                break;

            case R.id.action_about:
                startActivity(new Intent(MainActivity.this,popAbout.class));
                break;

            case R.id.action_exit:
            finish();
                break;


        }
        return super.onOptionsItemSelected(item);
    }



    public void Randomize(View view)
    {
        CopyButton.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.GONE);
        //randomize a quote
        textView.setText(quotes.get(Math.abs(gen.nextInt()) % quotes.size()));
        //changing fivap's face
        imageButton.setImageDrawable(getResources().getDrawable(R.drawable.fivap2));

    }


    public void onClick(View v) { //copy to clipboard
        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("simple text", textView.getText());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(getApplicationContext(), "Цитата скопирована в буфер обмена.",
                Toast.LENGTH_LONG).show();
    }
}





