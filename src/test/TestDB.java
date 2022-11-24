package test;

import java.util.Date;

import entities.Client;
import entities.Commande;
import entities.Fournisseur;
import entities.LigneCommande;
import entities.Produit;
import entities.Rayon;
import services.ClientService;
import services.CommandeService;
import services.FournisseurService;
import services.LigneCommandeService;
import services.ProduitService;
import services.RayonService;

public class TestDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientService cs = new ClientService();
		cs.create(new Client("Tahiri Abdou", "0609734140", "a.tahiri@emsi-edu.ma"));
		cs.create(new Client("Samir Malak", "0672346798", "i.samir@emsi-edu.ma"));
		cs.create(new Client("Ana", "0666666666", "Ana@gmail.com"));
		cs.create(new Client("Hoa", "0664566097", "Hoa@gmail.com"));
		cs.delete(cs.findById(4));
		cs.update(new Client(3, "Lopez Jennifer", "067777772", "j.lopez@emsi-edu.ma"));
		System.out.println(cs.findById(2));
		FournisseurService fs = new FournisseurService();
		fs.create(new Fournisseur("Fournisseur1", "0698551885"));
		fs.create(new Fournisseur("Fournisseur2", "0524472514"));
		
		RayonService rs = new RayonService();
		
		rs.create(new Rayon("Fruits"));
		rs.create(new Rayon("Lègumes"));

		
	}

 }
