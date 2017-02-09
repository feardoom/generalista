package view;

import controller.Stock;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class FArticle extends Scene {
	Group gp;
	Stock stock;
	
	public FArticle(Stock stock, double width, double height) {
		super(new Group(), width, height);
		gp = (Group) this.getRoot();
		this.stock = stock;
		
		init();
		
	}

	private void init() {
		GridPane grid = new GridPane();
		
		Label lblNome = new Label("Nome");
		TextField txtNome = new TextField();
		grid.add(lblNome, 0, 0);
		grid.add(txtNome, 1, 0);
		
		Label lblPreco = new Label("Preco");
		TextField txtPreco = new TextField();
		grid.add(lblPreco, 0, 1);
		grid.add(txtPreco, 1, 1);
		
		Label lblDesc = new Label("Descricao");
		TextArea txtDesc = new TextArea();
		grid.add(lblDesc, 0, 2);
		grid.add(txtDesc, 1, 2);
		
		Button cmdGravar = new Button("Gravar");
		grid.add(cmdGravar, 1, 3);
		
		grid.setHgap(10);
		grid.setVgap(10);
		
		cmdGravar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Nome " + txtNome.getText() + "\n" + "Preco " + txtPreco.getText() + "\n" + "Descricao " + txtDesc.getText());
				
			}
		});
		
		gp.getChildren().add(grid);
		
	}
	
}
