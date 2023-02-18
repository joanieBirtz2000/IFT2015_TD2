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
    }
    
    public ArrayList<Cell> grid=new ArrayList<>();
    /**
     * 4 columns / 3 lines
     */
    public Grid(){
    	int[] values= {25,10,1,10,1,5,5,10,1,10,1,-1};
        for(int i=0; i<values.length;i++) {
        	Cell cell=new Cell(null,null,null,null,values[i]);
        	switch(i) {
        	case 1:
        		grid.get(0).setPointeur_droite(cell);
        		cell.setPointeur_gauche(grid.get(0));
        		break;
        	case 2:
        		grid.get(1).setPointeur_droite(cell);
        		cell.setPointeur_gauche(grid.get(1));
        		break;
        	case 3:
        		grid.get(2).setPointeur_droite(cell);
        		cell.setPointeur_gauche(grid.get(2));
        		break;
        	case 4:
        		grid.get(0).setPointeur_bas(cell);
        		cell.setPointeur_haut(grid.get(0));
        		break;
        	case 5:
        		grid.get(4).setPointeur_droite(cell);
        		cell.setPointeur_gauche(grid.get(4));
        		grid.get(1).setPointeur_bas(cell);
        		cell.setPointeur_haut(grid.get(1));
        		break;
        	case 6:
        		grid.get(5).setPointeur_droite(cell);
        		cell.setPointeur_gauche(grid.get(5));
        		grid.get(2).setPointeur_bas(cell);
        		cell.setPointeur_haut(grid.get(2));
        		break;
        	case 7:
        		grid.get(6).setPointeur_droite(cell);
        		cell.setPointeur_gauche(grid.get(6));
        		grid.get(3).setPointeur_bas(cell);
        		cell.setPointeur_haut(grid.get(3));
        		break;
        	case 8:
        		grid.get(4).setPointeur_bas(cell);
        		cell.setPointeur_haut(grid.get(4));
        		break;
        	case 9:
        		grid.get(8).setPointeur_droite(cell);
        		cell.setPointeur_gauche(grid.get(8));
        		grid.get(5).setPointeur_bas(cell);
        		cell.setPointeur_haut(grid.get(5));
        		break;
        	case 10:
        		grid.get(9).setPointeur_droite(cell);
        		cell.setPointeur_gauche(grid.get(9));
        		grid.get(6).setPointeur_bas(cell);
        		cell.setPointeur_haut(grid.get(6));
        		break;
        	case 11:
        		grid.get(10).setPointeur_droite(cell);
        		cell.setPointeur_gauche(grid.get(10));
        		grid.get(7).setPointeur_bas(cell);
        		cell.setPointeur_haut(grid.get(7));
        		break;
        	}
        	grid.add(cell);
        }

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