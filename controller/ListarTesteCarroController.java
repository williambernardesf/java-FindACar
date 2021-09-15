package controller;

import java.sql.ResultSet;

import dao.TesteDao;
import view.ListarTesteCarroView;


public class ListarTesteCarroController {
	
	private TesteDao tDAO;
    private ResultSet rs;
    private ListarTesteCarroView ltcv;   
    
    public ListarTesteCarroController(){
        
        tDAO = new TesteDao();
        //rs = tDAO.listarTeste();
        
        ltcv = new ListarTesteCarroView();
        ltcv.telaListarTeste(rs);
        
    }
}