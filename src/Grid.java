import java.util.*;

//import Grid.Cell;

public class Grid {
    public class Cell {
        private Cell pointeur_haut;
        private Cell pointeur_droite;
        private Cell pointeur_bas;
        private Cell pointeur_gauche;
        private int valeur;
        
        public Cell(Cell pointeur_haut, Cell pointeur_droite, Cell pointeur_bas, Cell pointeur_gauche, int valeur) {
        	this.pointeur_haut=pointeur_haut;
        	this.pointeur_droite=pointeur_droite;
        	this.pointeur_bas=pointeur_bas;
        	this.pointeur_gauche=pointeur_gauche;
        	this.valeur=valeur;
        }
        
        public Cell getPointeur_haut() {
			return pointeur_haut;
		}

		public void setPointeur_haut(Cell pointeur_haut) {
			this.pointeur_haut = pointeur_haut;
		}

		public Cell getPointeur_droite() {
			return pointeur_droite;
		}

		public void setPointeur_droite(Cell pointeur_droite) {
			this.pointeur_droite = pointeur_droite;
		}

		public Cell getPointeur_bas() {
			return pointeur_bas;
		}

		public void setPointeur_bas(Cell pointeur_bas) {
			this.pointeur_bas = pointeur_bas;
		}

		public Cell getPointeur_gauche() {
			return pointeur_gauche;
		}

		public void setPointeur_gauche(Cell pointeur_gauche) {
			this.pointeur_gauche = pointeur_gauche;
		}

		public int getValeur() {
			return valeur;
		}

		public void setValeur(int valeur) {
			this.valeur = valeur;
		}

		public Cell(){
        }
    }
    
    // TODO

    public Grid(){
    	Cell case1=new Cell(null,new Cell(),new Cell(),null,25);
        List<Cell> grid= Arrays.asList(new Cell());
    }

    public boolean move(Cell box){
        // TODO
        return true;
    }

    public boolean check_complete(){
        // TODO
        return true;
    }

    public void solve_game(){
        // TODO
    }
}