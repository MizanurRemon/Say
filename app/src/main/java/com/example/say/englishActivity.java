package com.example.say;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class englishActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton backButton;
    ImageView showimage;
    Button buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG;
    Button buttonH, buttonI, buttonJ, buttonK, buttonL, buttonM, buttonN;
    Button buttonO, buttonP, buttonQ, buttonR, buttonS, buttonT, buttonU;
    Button buttonV, buttonW, buttonX, buttonY, buttonZ;

    MediaPlayer a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        backButton = (ImageButton) findViewById(R.id.imagebuttonID);
        showimage = (ImageView) findViewById(R.id.imageviewID);
        buttonA = (Button) findViewById(R.id.buttonA);
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonD = (Button) findViewById(R.id.buttonD);
        buttonE = (Button) findViewById(R.id.buttonE);
        buttonF = (Button) findViewById(R.id.buttonF);
        buttonG = (Button) findViewById(R.id.buttonG);
        buttonH = (Button) findViewById(R.id.buttonH);
        buttonI = (Button) findViewById(R.id.buttonI);
        buttonJ = (Button) findViewById(R.id.buttonJ);
        buttonK = (Button) findViewById(R.id.buttonK);
        buttonL = (Button) findViewById(R.id.buttonL);
        buttonM = (Button) findViewById(R.id.buttonM);
        buttonN = (Button) findViewById(R.id.buttonN);
        buttonO = (Button) findViewById(R.id.buttonO);
        buttonP = (Button) findViewById(R.id.buttonP);
        buttonQ = (Button) findViewById(R.id.buttonQ);
        buttonR = (Button) findViewById(R.id.buttonR);
        buttonS = (Button) findViewById(R.id.buttonS);
        buttonT = (Button) findViewById(R.id.buttonT);
        buttonU = (Button) findViewById(R.id.buttonU);
        buttonV = (Button) findViewById(R.id.buttonV);
        buttonW = (Button) findViewById(R.id.buttonW);
        buttonX = (Button) findViewById(R.id.buttonX);
        buttonY = (Button) findViewById(R.id.buttonY);
        buttonZ = (Button) findViewById(R.id.buttonZ);

        a = MediaPlayer.create(this, R.raw.apple);
        b = MediaPlayer.create(this, R.raw.book);
        c = MediaPlayer.create(this, R.raw.cat);
        d = MediaPlayer.create(this, R.raw.dog);
        e = MediaPlayer.create(this, R.raw.elephant);
        f = MediaPlayer.create(this, R.raw.frog);
        g = MediaPlayer.create(this, R.raw.goat);
        h = MediaPlayer.create(this, R.raw.horse);
        i = MediaPlayer.create(this, R.raw.ink);
        j = MediaPlayer.create(this, R.raw.jug);
        k = MediaPlayer.create(this, R.raw.kangaroo);
        l = MediaPlayer.create(this, R.raw.laptop);
        m = MediaPlayer.create(this, R.raw.mango);
        n = MediaPlayer.create(this, R.raw.nose);
        o = MediaPlayer.create(this, R.raw.ox);
        p = MediaPlayer.create(this, R.raw.penguine);
        q = MediaPlayer.create(this, R.raw.queen);
        r = MediaPlayer.create(this, R.raw.rat);
        s = MediaPlayer.create(this, R.raw.sheep);
        t = MediaPlayer.create(this, R.raw.tea);
        u = MediaPlayer.create(this, R.raw.umbrella);
        v = MediaPlayer.create(this, R.raw.vegetable);
        w = MediaPlayer.create(this, R.raw.wood);
        x = MediaPlayer.create(this, R.raw.xray);
        y = MediaPlayer.create(this, R.raw.yak);
        z = MediaPlayer.create(this, R.raw.zebra);

        backButton.setOnClickListener(this);
        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonD.setOnClickListener(this);
        buttonE.setOnClickListener(this);
        buttonF.setOnClickListener(this);
        buttonG.setOnClickListener(this);
        buttonH.setOnClickListener(this);
        buttonI.setOnClickListener(this);
        buttonJ.setOnClickListener(this);
        buttonK.setOnClickListener(this);
        buttonL.setOnClickListener(this);
        buttonM.setOnClickListener(this);
        buttonN.setOnClickListener(this);
        buttonO.setOnClickListener(this);
        buttonP.setOnClickListener(this);
        buttonQ.setOnClickListener(this);
        buttonR.setOnClickListener(this);
        buttonS.setOnClickListener(this);
        buttonT.setOnClickListener(this);
        buttonU.setOnClickListener(this);
        buttonV.setOnClickListener(this);
        buttonW.setOnClickListener(this);
        buttonX.setOnClickListener(this);
        buttonY.setOnClickListener(this);
        buttonZ.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imagebuttonID) {
            finish();
            Intent intent = new Intent(englishActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
        else if (view.getId() == R.id.buttonA) {
            a.start();
            showimage.setImageResource(R.drawable.apple);
        }
        else if (view.getId() == R.id.buttonB) {
            b.start();
            showimage.setImageResource(R.drawable.book);
        }
        else if (view.getId() == R.id.buttonC) {
            c.start();
            showimage.setImageResource(R.drawable.cat);
        }
        else if (view.getId() == R.id.buttonD) {
            d.start();
            showimage.setImageResource(R.drawable.dog);
        }
        else if (view.getId() == R.id.buttonE) {
            e.start();
            showimage.setImageResource(R.drawable.elephant);
        }
        else if (view.getId() == R.id.buttonF) {
            f.start();
            showimage.setImageResource(R.drawable.frog);
        }
        else if (view.getId() == R.id.buttonG) {
            g.start();
            showimage.setImageResource(R.drawable.goat);
        }
        else if (view.getId() == R.id.buttonH) {
            h.start();
            showimage.setImageResource(R.drawable.horse);
        }
        else if (view.getId() == R.id.buttonI) {
            i.start();
            showimage.setImageResource(R.drawable.ink);
        }
        else if (view.getId() == R.id.buttonJ) {
            j.start();
            showimage.setImageResource(R.drawable.jug);
        }
        else if (view.getId() == R.id.buttonK) {
            k.start();
            showimage.setImageResource(R.drawable.kangaroo);
        }
        else if (view.getId() == R.id.buttonL) {
            l.start();
            showimage.setImageResource(R.drawable.laptop);
        }
        else if (view.getId() == R.id.buttonM) {
            m.start();
            showimage.setImageResource(R.drawable.mango);
        }
        else if (view.getId() == R.id.buttonN) {
            n.start();
            showimage.setImageResource(R.drawable.nose);
        }
        else if (view.getId() == R.id.buttonO) {
            o.start();
            showimage.setImageResource(R.drawable.ox);
        }
        else if (view.getId() == R.id.buttonP) {
            p.start();
            showimage.setImageResource(R.drawable.penguine);
        }
        else if (view.getId() == R.id.buttonQ) {
            q.start();
            showimage.setImageResource(R.drawable.queen);
        }
        else if (view.getId() == R.id.buttonR) {
            r.start();
            showimage.setImageResource(R.drawable.rat);
        }
        else if (view.getId() == R.id.buttonS) {
            s.start();
            showimage.setImageResource(R.drawable.sheep);
        }
        else if (view.getId() == R.id.buttonT) {
            t.start();
            showimage.setImageResource(R.drawable.tea);
        }
        else if (view.getId() == R.id.buttonU) {
            u.start();
            showimage.setImageResource(R.drawable.umbrella);
        }
        else if (view.getId() == R.id.buttonV) {
            v.start();
            showimage.setImageResource(R.drawable.vegetable);
        }
        else if (view.getId() == R.id.buttonW) {
            w.start();
            showimage.setImageResource(R.drawable.wood);
        }
        else if (view.getId() == R.id.buttonX) {
            x.start();
            showimage.setImageResource(R.drawable.xray);
        }
        else if (view.getId() == R.id.buttonY) {
            y.start();
            showimage.setImageResource(R.drawable.yak);
        }
        else if(view.getId()== R.id.buttonZ){
            z.start();
            showimage.setImageResource(R.drawable.zebra);
        }
    }
}