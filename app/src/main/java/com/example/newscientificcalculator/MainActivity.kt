package com.example.newscientificcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.math.cos
import kotlin.math.ln
import kotlin.math.log10
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.math.tan

class MainActivity : AppCompatActivity() {

    lateinit var primaryTV:TextView
    lateinit var secondaryTV:TextView

    lateinit var acBtn:Button
    lateinit var cBtn:Button
    lateinit var brac1Btn:Button
    lateinit var brac2Btn:Button
    lateinit var sinBtn:Button
    lateinit var cosBtn:Button
    lateinit var tanBtn:Button
    lateinit var logBtn:Button
    lateinit var lnBtn:Button
    lateinit var factBtn:Button
    lateinit var squareBtn:Button
    lateinit var sqrootBtn:Button
    lateinit var invBtn:Button
    lateinit var btndiv:Button
    lateinit var btn7:Button
    lateinit var btn8:Button
    lateinit var btn9:Button
    lateinit var btn4:Button
    lateinit var btn5:Button
    lateinit var btn6:Button
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btnmul:Button
    lateinit var btnadd:Button
    lateinit var btnsub:Button
    lateinit var btnpi:Button
    lateinit var btn0:Button
    lateinit var btndot:Button
    lateinit var btnequals:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        primaryTV=findViewById(R.id.idTVPrimary)
        secondaryTV=findViewById(R.id.idTVSecondary)

        acBtn=findViewById(R.id.idBtnAC)
        cBtn=findViewById(R.id.idBtnC)
        brac1Btn=findViewById(R.id.idBtnBrac1)
        brac2Btn=findViewById(R.id.idBtnBrac2)
        sinBtn=findViewById(R.id.idBtnSin)
        cosBtn =findViewById(R.id.idBtnCos)
        tanBtn=findViewById(R.id.idBtnTan)
        logBtn=findViewById(R.id.idBtnLog)
        lnBtn=findViewById(R.id.idBtnLn)
        factBtn=findViewById(R.id.idBtnfact)
        squareBtn=findViewById(R.id.idBtnSquare)
        sqrootBtn=findViewById(R.id.idBtnSqRoot)
        invBtn=findViewById(R.id.idBtnInv)
        btndiv=findViewById(R.id.idBtnDiv)
        btn1=findViewById(R.id.idBtn1)
        btn2=findViewById(R.id.idBtn2)
        btn3=findViewById(R.id.idBtn3)
        btn4=findViewById(R.id.idBtn4)
        btn5=findViewById(R.id.idBtn5)
        btn6=findViewById(R.id.idBtn6)
        btn7=findViewById(R.id.idBtn7)
        btn8=findViewById(R.id.idBtn8)
        btn9=findViewById(R.id.idBtn9)
        btnmul=findViewById(R.id.idBtnMul)
        btnadd=findViewById(R.id.idBtnAdd)
        btnsub=findViewById(R.id.idBtnSub)
        btnpi=findViewById(R.id.idBtnPi)
        btn0 =findViewById(R.id.idBtnZero)
        btndot=findViewById(R.id.idBtnDot)
        btnequals=findViewById(R.id.idBtnEqual)


        btn0.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"0")
        }
        btn1.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"1")
        }
        btn2.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"2")
        }
        btn3.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"3")
        }
        btn4.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"4")
        }
        btn5.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"5")
        }
        btn6.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"6")
        }
        btn7.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"7")
        }
        btn8.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"8")
        }
        btn9.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"9")
        }
        btndot.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+".")
        }
        btnadd.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"+")
        }
        btndiv.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"/")
        }
        brac1Btn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"(")
        }
        brac2Btn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+")")
        }
        btnpi.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"3.142")
            secondaryTV.text=(btnpi.text.toString())
        }

        sinBtn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"sin")
        }
        cosBtn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"cos")
        }
        tanBtn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"tan")
        }
        invBtn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"^"+"(-1)")
        }
        lnBtn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"ln")
        }
        logBtn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"log")
        }

        btnsub.setOnClickListener{
            val str:String=primaryTV.text.toString()
            if(!str.get(index=str.length-1).equals("-")){
                primaryTV.text=(primaryTV.text.toString()+"-")
            }
        }
        btnmul.setOnClickListener{
            val str:String=primaryTV.text.toString()
            if(!str.get(index=str.length-1).equals("*")){
                primaryTV.text=(primaryTV.text.toString()+"*")
            }
        }
        sqrootBtn.setOnClickListener{
            if(primaryTV.text.toString().isEmpty()){
                Toast.makeText(this@MainActivity,"Please enter a valid number",Toast.LENGTH_SHORT).show()
            }
            else{
                val str=primaryTV.text.toString()
                val r= sqrt(str.toDouble())
                primaryTV.text=r.toString()
            }
        }
        acBtn.setOnClickListener{
            primaryTV.text=""
            secondaryTV.text=""
        }
        cBtn.setOnClickListener{
            var str=primaryTV.text.toString()
            if(str != ""){
                str=str.substring(0,str.length-1)
                primaryTV.text=str
            }
        }
        squareBtn.setOnClickListener{
            if(primaryTV.text.toString().isEmpty()){
                Toast.makeText(this@MainActivity,"Please enter a valid number",Toast.LENGTH_SHORT).show()
            }
            else {
                val d=primaryTV.text.toString().toDouble()
                val square=d*d
                primaryTV.text=square.toString()
                secondaryTV.text=square.toString()
            }
        }
        factBtn.setOnClickListener{
            if(primaryTV.text.toString().isEmpty()){
                Toast.makeText(this@MainActivity,"Please enter a valid number",Toast.LENGTH_SHORT).show()
            }
            else{
                val value=primaryTV.text.toString().toInt()
                val fact=factorial(value)
                primaryTV.text=fact.toString()
                secondaryTV.text=fact.toString()
            }
        }
        btnequals.setOnClickListener{
            val str=primaryTV.text.toString()
            val result:Double=evaluate(str)
            val r=result.toString()
            primaryTV.text=r
            secondaryTV.text=str
        }

    }

    fun factorial(n:Int):Int{
        return if(n==1 || n==0) 1 else n*factorial(n-1)
    }

    fun evaluate(str:String):Double{

        return object :Any(){
            var pos=-1
            var ch=0

            fun nextchar(){
                ch = if(++pos < str.length) str[pos].toInt() else -1
            }
            fun eat(charToEdt:Int):Boolean{
                while(ch==' '.toInt()){
                    nextchar()
                }
                if(ch==charToEdt){
                    nextchar()
                    return true
                }
                return false
            }
            fun parse():Double{
                nextchar()
                val x=parseExpression()
                if(pos<str.length){
                    throw RuntimeException("Unexpected: "+ch.toChar())
                }
                return x
            }
            fun parseExpression():Double{
                var x=parseTerm()
                while (true){
                    if(eat('+'.toInt())){
                        x+=parseTerm()
                    }
                    else if(eat('-'.toInt())){
                        x-=parseTerm()
                    }
                    else{
                        return x
                    }
                }
            }
            fun parseTerm():Double{

                var x=parseFactor()
                while (true){
                    if(eat('*'.toInt())){
                        x*=parseFactor()
                    }
                    else if(eat('/'.toInt())){
                        x/=parseFactor()
                    }
                    else{
                        return x
                    }
                }
            }
            fun parseFactor():Double{
                if(eat('+'.toInt())){
                    return parseFactor()
                }
                if(eat('-'.toInt())){
                    return parseFactor()
                }

                var x:Double
                val startpos=pos
                if(eat('('.toInt())){
                    x=parseExpression()
                    eat(')'.toInt())
                }
                else if(ch>='0'.toInt() && ch<='9'.toInt() || ch=='.'.toInt()){

                    while (ch>='0'.toInt() && ch<='9'.toInt() || ch=='.'.toInt()){
                        nextchar()
                    }
                    x=str.substring(startpos,pos).toDouble()
                }
                else if(ch>='a'.toInt() && ch<='z'.toInt()) {

                    while (ch>='a'.toInt() && ch<='z'.toInt()){
                        nextchar()
                    }
                    val func = str.substring(startpos, pos)
                    x = parseFactor()
                    if(func=="sqrt"){
                        x= sqrt(x)
                    }
                    else if(func=="sin"){
                        x=sin(Math.toRadians(x))
                    }
                    else if(func=="cos"){
                        x=cos(Math.toRadians(x))
                    }
                    else if(func=="tan"){
                        x=tan(Math.toRadians(x))
                    }
                    else if(func=="log"){
                        x=log10(x)
                    }
                    else if(func=="ln"){
                        x= ln(x)
                    }
                }
                else{
                    throw RuntimeException("Unexpected: "+ch.toChar())
                }
                if(eat('^'.toInt())){
                    x= x.pow(parseFactor())
                }
                return x
            }

        }.parse()

    }
}