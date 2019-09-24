package ui;
import java.util.Scanner;

import Model.*;

public class Main {
	
	private Scanner entry;
	
	public static void main(String[] args) {
		
		Main m = new Main();
		m.showSelection();
	}	
	
	public Main() {

		entry =new Scanner(System.in);	
		
		
	}

	public void showMenu() {
		
	    System.out.println("-----------Bienvenido a Naruto Game--------");
	    System.out.println("Por favor seleccione la opcion que desea:");
	    System.out.println("1.A�adir un clan.");
		System.out.println("2.Eliminar un clan.");
		System.out.println("3.Buscar un clan.");
	    System.out.println("4.A�adir un personaje.");
		System.out.println("5.Eliminar un personaje.");
		System.out.println("6.Buscar un personaje.");
		System.out.println("7.A�adir una tecnica.");
		System.out.println("8.Eliminar una tecnica.");
		System.out.println("9.Buscar una tecnica.");
		System.out.println("10.Salir.");
			
	}
		
		public void showSelection() {
			showMenu();
			int option = entry.nextInt();
			
			int id, dateCreation, optin= 0;
			String name, race, lastName, date, typePetsFavorate;
			char gender;
			
			switch(option) {
			case 1:
				
//				System.out.println("Porfavor digite los datos siguientes: ");
//				System.out.println("numero de identificacion: ");
//				id = entry.nextInt();
//				System.out.println("nombre del club: ");
//				name = entry.next();
//				System.out.println("fecha de creacion: ");
//				dateCreation = entry.nextInt();
//				System.out.println("Raza de el animal: ");
//				race = entry.next();
//				ClubPets e = new ClubPets(id, name, dateCreation, race);
				
//				addClubPets(e);
//				System.out.println("Se logro agregar el club corretamente");
				break;}
		
//				
//			case 2:
//				
//				System.out.println("Porfavor digite los datos siguientes: ");
//				System.out.println("numero de identificacion: ");
//				id = entry.nextInt();
//				System.out.println("nombre del due�o: ");
//				name = entry.nextLine();
//				System.out.println("apellido: ");
//				lastName = entry.nextLine();
//				System.out.println("fecha de nacimiento: ");
//				date = entry.nextLine();
//				System.out.println("tipo de mascota favorita: ");
//				typePetsFavorate = entry.nextLine();
//				Owner o = new Owner(id, name, lastName, date, typePetsFavorate);
//				clubPets.get(0).addOwner(o);
////				int id, String name, String lastName, String date, String typePetsFavorate
//				
//				break;
//			case 3:
//			
//				System.out.println("Porfavor digite los datos siguientes: ");
//				System.out.println("numero de identificacion: ");
//				id = entry.nextInt();
//				System.out.println("nombre del la mascota: ");
//				name = entry.nextLine();
//				System.out.println("fecha de nacimiento: ");
//				date = entry.nextLine();
//				System.out.println("genero: ");
//				gender = entry.next().charAt(0);
//			    System.out.println("raza: ");
//				race = entry.nextLine();
//				Pet u = new Pet(id, name, date, gender, race);
//				if(clubPets.get(0).owner.get(0).addPet(u,name) == true) {
//					System.out.println("Se pudo agregar la mascota correctamente");
//				} else {
//					System.out.println("No se pudo agregar la mascota correctamente");
//				}
////				int id, String name, String date, char gender, String race
//				
//				break;
//			case 4:
//				
//				System.out.println("digite por favor el nombre del club que desea eliminar: ");
//				name = entry.nextLine();
//				removeClub(name);
//				
//				break;
//			case 5:
//				
//				System.out.println("digite por favor el nombre del due�o que desea eliminar: ");
//				name = entry.nextLine();
////				removeOwner(name);
//				
//				break;
//			case 6:
//				
//				System.out.println("digite por favor el nombre de la mascota que desea eliminar: ");
//				name = entry.nextLine();
////				removePet(name);
//				
//				break;
//			case 7:
//				System.out.println(" ");
//				System.out.println("Seleciona una opcion: ");
//				System.out.println("1.Ordenar por identificacion.");
//				System.out.println("2.Ordenar por nombre.");
//				System.out.println("3.Ordenar por fecha.");
//				System.out.println("4.Ordenar por raza.");
//				System.out.println("5.Imprimir listado ordenado de los clubs segun la cantidad de due�os que tenga.");
//				System.out.println("6.Salir.");
//				optin = entry.nextInt();
//				if(optin == 1 ) {
//					System.out.println("Ordenado por identificacion: ");
////					System.out.println(ordenarClubId());
//					
//				} else if (optin == 2) {
//					System.out.println("Ordenado por nombre: ");
////					System.out.println(ordenarClubNombre());
//				} else if (optin == 3) {
//					System.out.println("Ordenado por fecha: ");
////					System.out.println(ordenarClubFecha());
//				} else if (optin == 4) {
//					System.out.println("Ordenado por raza: ");
////					System.out.println(ordenarClubRaza());
//				} else if (optin == 5) {
//					System.out.println("Listado ordenado de los clubs segun la cantidad de due�os que tenga: ");
////					System.out.println(orderingclubNumOwner());
//				} else if(optin == 6) {
//					System.out.println("bye.");
//					break;
//				}
//				break;
//			case 8:
//				System.out.println(" ");
//				System.out.println("Seleciona una opcion: ");
//				System.out.println("1.Ordenar por identificacion.");
//				System.out.println("2.Ordenar por nombre.");
//				System.out.println("3.Ordenar por apellido.");
//				System.out.println("4.Ordenar por fecha.");
//				System.out.println("5.Ordenar por tipo de mascota favorita.");
//				System.out.println("6.Imprimir listado ordenado de los due�os segun la cantidad de mascotas que tenga");
//				System.out.println("7.Salir.");
//				optin = entry.nextInt();
//				if(optin == 1 ) {
//					System.out.println("Ordenado por identificacion: ");
////					System.out.println(ordenarOwnerId());
//				} else if (optin == 2) {
//					System.out.println("Ordenado por nombre: ");
////					System.out.println(ordenarOwnerNombre());
//				} else if (optin == 3) {
//					System.out.println("Ordenado por apellido: ");
////					System.out.println(ordenarOwnerLastNombre());
//				} else if (optin == 4) {
//					System.out.println("Ordenado por fecha: ");
////					System.out.println(ordenarOwnerDate());
//				} else if (optin == 5) {
//					System.out.println("Ordenado por tipo de mascota favorita: ");
////					System.out.println(ordenarOwnerPetFavorite());
//				} else if(optin == 6) {
//					System.out.println("Listado ordenado de los due�o segun la cantidad de mascotas que tenga: ");
////					System.out.println(orderingOwnerNumPets());
//				} else if (optin == 7) {
//					System.out.println("bye.");
//					break;
//				}
//				break;
////				int id, String name, String date, char gender, String race
//			case 9:
//				System.out.println(" ");
//				System.out.println("Seleciona una opcion: ");
//				System.out.println("1.Ordenar por identificacion.");
//				System.out.println("2.Ordenar por nombre.");
//				System.out.println("3.Ordenar por fecha.");
//				System.out.println("4.Ordenar por genero.");
//				System.out.println("5.Ordenar por raza.");
//				System.out.println("6.Salir.");
//				optin = entry.nextInt();
//				if(optin == 1 ) {
//					System.out.println("Ordenado por identificacion: ");
////					System.out.println(ordenarPetId());
//				} else if (optin == 2) {
//					System.out.println("Ordenado por nombre: ");
////					System.out.println(ordenarPetNombre());
//				} else if (optin == 3) {
//					System.out.println("Ordenado por fecha: ");
////					System.out.println(ordenarPetFecha());
//				} else if (optin == 4) {
//					System.out.println("Ordenado por genero: ");
////					System.out.println(ordenarPetGender());
//				} else if (optin == 5) {
//					System.out.println("Ordenado por raza: ");
////					System.out.println(ordenarPetRace());
//				} else if (optin == 6) {
//					System.out.println("bye.");
//					break;
//				}
//				break;
//			case 10:
//				System.out.println("Que objeto deseas buscar: ");
//				System.out.println("1. un Club");
//				System.out.println("2. un due�o");
//				System.out.println("3. una mascota");
//				int op = entry.nextInt();
//				if (op == 1) {
//					System.out.println("Un Club");
//					System.out.println("Seleciona una opcion: ");
//					System.out.println("1.Buscar por identificacion.");
//					System.out.println("2.Buscar por nombre.");
//					System.out.println("3.Buscar por apellido.");
//					System.out.println("4.Buscar por fecha.");
//					System.out.println("5.Buscar por tipo de mascota favorita.");
//					System.out.println("6.Imprimir listado ordenado de los due�os segun la cantidad de mascotas que tenga");
//					System.out.println("7.Salir.");
//					optin = entry.nextInt();
//					if(optin == 1 ) {
//						System.out.println("Buscar por identificacion: ");
//						id = entry.nextInt();
////						if(buscarClubId(id) == true){
////							System.out.println("Se ha encontrado el club");
////						} else 
////						{
////							System.out.println("No se ha encontrado el club");
////						}
//					} else if (optin == 2) {
//						System.out.println("Buscar por nombre: ");
//						name = entry.nextLine();
////						if(buscarClubNombre(name) == true){
//////							System.out.println("Se ha encontrado el club");
//////						} else {
//////							System.out.println("No se ha encontrado el club");
//////						}
//					} else if (optin == 3) {
//						System.out.println("Buscar por fecha: ");
//						dateCreation = entry.nextInt();
////						if(buscarClubDateCreation(dateCreation) == true){
//////							System.out.println("Se ha encontrado el club");
//////						} else {
//////							System.out.println("No se ha encontrado el club");
//////						}
//					} else if (optin == 4) {
//						System.out.println("Buscar por raza: ");
//						race = entry.nextLine();
////						if(buscarClubRace(race) == true){
////		    				System.out.println("Se ha encontrado el club");
////  					} else {
////		  		          	System.out.println("No se ha encontrado el club");
////						}
//					} else if (optin == 5) {
//						System.out.println("bye.");}
//				} else if (op == 2) {
//					System.out.println("un due�o"); //int id, String name, String lastName, String date, String typePetsFavorate
//					System.out.println("Seleciona una opcion: ");
//					System.out.println("1.Buscar por identificacion.");
//					System.out.println("2.Buscar por nombre.");
//					System.out.println("3.Buscar por apellido.");
//					System.out.println("4.Buscar por fecha.");
//					System.out.println("5.Buscar por tipo de mascota favorita.");
//					System.out.println("6.Imprimir listado ordenado de los due�os segun la cantidad de mascotas que tenga");
//					System.out.println("7.Salir.");
//					optin = entry.nextInt();
//					if(optin == 1 ) {
//						System.out.println("Buscar por identificacion: ");
//						id = entry.nextInt();
////						if(buscarOwnerId() == true){
////		    				System.out.println("Se ha encontrado el club");
////  					} else if(){
////		  		          	System.out.println("No se ha encontrado el club");
////						}
////					
//					} else if (optin == 2) {
//						System.out.println("Buscar por nombre: ");
////						BuscarOwnerNombre();
//					} else if (optin == 3) {
//						System.out.println("Buscar por apellido: ");
////						BuscarOwnerLastNombre();
//					} else if (optin == 4) {
//						System.out.println("Buscar por fecha: ");
////						BuscarOwnerDate();
//					} else if (optin == 5) {
//						System.out.println("Buscar por tipo de mascota favorita: ");
////						BuscarOwnerPetFavorite();
//					} else if(optin == 6) {
//						System.out.println("Listado Buscar de los due�o segun la cantidad de mascotas que tenga: ");
////						BuscarOwnerNumPets();
//					} else if (optin == 7) {
//						System.out.println("bye.");}
//				
//				}else if (op == 3) {
//					
//					System.out.println(" ");
//					System.out.println("Seleciona una opcion: ");
//					System.out.println("1.Buscar por identificacion.");
//					System.out.println("2.Buscar por nombre.");
//					System.out.println("3.Buscar por apellido.");
//					System.out.println("4.Buscar por fecha.");
//					System.out.println("5.Buscar por tipo de mascota favorita.");
//					System.out.println("6.Imprimir listado ordenado de los due�os segun la cantidad de mascotas que tenga");
//					System.out.println("7.Salir.");
//					optin = entry.nextInt();
//					if(optin == 1 ) {
//						System.out.println("Buscar por identificacion: ");
////						buscarOwnerId();
//					} else if (optin == 2) {
//						System.out.println("Buscar por nombre: ");
////						BuscarOwnerNombre();
//					} else if (optin == 3) {
//						System.out.println("Buscar por apellido: ");
////						BuscarOwnerLastNombre();
//					} else if (optin == 4) {
//						System.out.println("Buscar por fecha: ");
////						BuscarOwnerDate();
//					} else if (optin == 5) {
//						System.out.println("Buscar por tipo de mascota favorita: ");
////						BuscarOwnerPetFavorite();
//					} else if(optin == 6) {
//						System.out.println("Listado Buscar de los due�o segun la cantidad de mascotas que tenga: ");
////						BuscarOwnerNumPets();
//					} else if (optin == 7) {
//						System.out.println("bye.");}
//				}	
//				break;
//			case 11:
//
//
//				System.out.println("chao home pues");
//				break;			
//			}
//
//		}
//		
//		public void addClubPets(ClubPets e) {
//			clubPets.add(e);
//		}
//
//		public void removeClub(String name) {
//			for (int i = 0; i < clubPets.size(); i++) {
//				if(clubPets.get(i).getName().equals(name)) {
//					clubPets.remove(i);
//					System.out.println("Se ha removido correctamente el club");
//				} else {
//					System.out.println("No se encontro ningun club con ese nombre");
//				}
//			}
		}
		
		
				

}
