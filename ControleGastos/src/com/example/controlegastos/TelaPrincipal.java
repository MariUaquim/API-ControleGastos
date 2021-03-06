package com.example.controlegastos;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class TelaPrincipal extends Activity {

	//Este metodo muda a Activity atual para a alvo. O parametro eh um enum. Se uma nova
	//tela for adicionada, ela deve ser adicionada no enum Telas tambem.
	public void TrocaTela(Telas aoTela)
	{
		Intent intent;
		switch(aoTela)
		{
		case AlterarSaldo:
			intent = new Intent(this, AlterarSaldo.class);
			break;
		case CadastroGanho:
			intent = new Intent(this, CadastroGanho.class);
			break;
		case CadastroGasto:
			intent = new Intent(this, CadastroGasto.class);
			break;
		case Relatorios:
			intent = new Intent(this, Relatorios.class);
			break;
		case VisualizaGanhos:
			intent = new Intent(this, VisualizaGanhos.class);
			break;
		case VisualizaGastos:
			intent = new Intent(this, VisualizaGastos.class);
			break;
		default:
			intent = null;
			break;
		}
		startActivity(intent);
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_principal);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_tela_principal, menu);
		return true;
	}
	
	public void IrAlterarSaldo(View view)
	{		
		TrocaTela(Telas.AlterarSaldo);
	}
	
	public void IrCadastroGanho(View view)
	{
		TrocaTela(Telas.CadastroGanho);
	}
	
	public void IrCadastroGasto(View view)
	{
		TrocaTela(Telas.CadastroGasto);
	}
	
	public void IrRelatorios(View view)
	{
		TrocaTela(Telas.Relatorios);
	}
	
	public void IrVisualizaGanhos(View view)
	{
		TrocaTela(Telas.VisualizaGanhos);
	}
	
	public void IrVisualizaGastos(View view)
	{
		TrocaTela(Telas.VisualizaGastos);
	}

}
