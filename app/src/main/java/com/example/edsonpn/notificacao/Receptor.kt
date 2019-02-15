package com.example.edsonpn.notificacao

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_receptor.*

class Receptor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receptor)
        val dados : Bundle = intent.extras
        val mensagem = dados.getString("mensagem")
        textView_mensagem.text = mensagem
    }




}
