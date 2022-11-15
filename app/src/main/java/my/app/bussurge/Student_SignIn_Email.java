package my.app.bussurge;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Student_SignIn_Email extends AppCompatActivity {

    TextInputLayout t1 , t2;
    ProgressBar bar;
    FirebaseAuth mAuth;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_sign_in_email);

        t1 = (TextInputLayout) findViewById(R.id.StudentEmailSignin);
        t2 = (TextInputLayout) findViewById(R.id.StudentpwdSignin);
        bar = (ProgressBar) findViewById(R.id.progressBar_Student_SignIn);
        mAuth = FirebaseAuth.getInstance();

    }

    public void signinhere(View view) {

        bar.setVisibility(View.VISIBLE);
        String email = t1.getEditText().getText().toString();
        String password = t2.getEditText().getText().toString();

        mAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(Student_SignIn_Email.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            //Sign in success , update UI with the signed in user's information

                            bar.setVisibility(View.INVISIBLE);
                            Intent intent = new Intent(Student_SignIn_Email.this,MainActivity.class);
                            intent.putExtra("email",mAuth.getCurrentUser().getEmail());
                            intent.putExtra("uid",mAuth.getCurrentUser().getUid());
                            startActivity(intent);

                        }else{
                            //If Sign in Fails , Display a Message to the User.

                            bar.setVisibility(View.INVISIBLE);
                            t1.getEditText().setText("");
                            t2.getEditText().setText("");
                            Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}