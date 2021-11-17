package org.techtown.colosseum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import org.json.JSONObject
import org.techtown.colosseum.databinding.ActivityMainBinding

class MainActivity :BaseActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()


    }




    override fun setupEvents() {

        binding.btnLogin.setOnClickListener{

            val inputEmail = binding.edtEmail.text.toString()
            val inputPw = binding.edtPassword.text.toString()

//            서버에서 이메일 / 비번이 맞는 계정인지? 로그인 요청

            ServerUtil.postRequestLogin(inputEmail, inputPw, object : ServerUtil.JsonResponseHandler {

                override fun onResponse(jsonObj: JSONObject) {
//                    로그인 API를 호출하고 돌아온 상황
//                    결과로 jsonObj 하나를 받아서 돌아온 상황

                    Log.d("화면에서의 jsonObj",jsonObj.toString())
                }



            })



        }



    }

    override fun setValues() {

    }


}