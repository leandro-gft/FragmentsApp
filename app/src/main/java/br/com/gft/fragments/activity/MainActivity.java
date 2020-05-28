package br.com.gft.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import br.com.gft.fragments.R;
import br.com.gft.fragments.fragment.ContatosFragment;
import br.com.gft.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnConversas, btnContatos;
    private TextView textConversa, textContato;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContatos = findViewById(R.id.btnContatos);
        btnConversas = findViewById(R.id.btnConversas);
        textConversa = findViewById(R.id.textConversa);
        textContato = findViewById(R.id.textContato);


        //Remover sombra do action bar
        getSupportActionBar().setElevation(0);

        //Instancias dos fragments
        conversasFragment = new ConversasFragment();
        contatosFragment = new ContatosFragment();

        btnConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, conversasFragment);
                transaction.commit();

                Snackbar.make(v, "Você clicou em Conversas", Snackbar.LENGTH_LONG).
                        setAction("Confirmar", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                                transaction.replace(R.id.frameConteudo, conversasFragment);
                                transaction.commit();
                            }
                        }).
                        show();

            }
        });


        btnContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(v, "Você clicou em Contatos", Snackbar.LENGTH_LONG).
                        setAction("Confirmar", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frameConteudo, contatosFragment);
                        transaction.commit();
                    }
                }).
                        show();


            }

        });
    }
}
