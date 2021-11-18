package org.techtown.colosseum

import android.os.Bundle
import android.os.PersistableBundle
import androidx.databinding.DataBindingUtil
import org.techtown.colosseum.databinding.ActivitySignUpBinding

class SignUpActivity : BaseActivity() {

    lateinit var binding :ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up)

        setupEvents()
        setValues()


    }


    override fun setupEvents() {

        binding.btnOk.setOnClickListener{

//             email/ pw/ nickname 변수에 담아두자

            val inputEmail = binding.edtEmail.text.toString()
            val inPwl = binding.edtPassword.text.toString()
            val inputNickname = binding.edtNickname.text.toString()


//          서버의 회원가입 기능에 전달 (request) -> 돌아온 응답 대응 ( response)

        }


    }

    override fun setValues() {

    }



}

