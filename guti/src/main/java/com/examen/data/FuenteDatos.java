package com.examen.data;

import java.util.ArrayList;

import com.examen.model.Jugador;
import com.examen.model.Posicion;

public class FuenteDatos {
    private static FuenteDatos instance;
    private ArrayList<Jugador> jugadores;
    private ArrayList<String> equipos;
    
    private FuenteDatos(){
        inicializar();
    }

    public static FuenteDatos getInstance(){
        if (instance == null) {
            instance = new FuenteDatos();
        }
        return instance;
    }

    public ArrayList<Jugador> getJugadores(){
        return this.jugadores;
    }

    public ArrayList<Jugador> getJugadoresPorEquipo(String nombreEquipo) {
        ArrayList<Jugador> equipo = new ArrayList<>();
        for (Jugador jugador : jugadores) {
            if (jugador.getEquipoOriginal().equals(nombreEquipo)) {
                equipo.add(jugador);
            }
        }

        return equipo;
    }

    public ArrayList<String> getEquipos() {
        return this.equipos;
    }

    private void inicializar(){
        jugadores = new ArrayList<>();
        equipos = new ArrayList<>();

        equipos.add("Betis");
        equipos.add("Real Madrid");
        equipos.add("Barcelona");
        equipos.add("Atletico Madrid");
        equipos.add("Sevilla");
        equipos.add("Valencia");
        equipos.add("Villarreal");
        equipos.add("Real Sociedad");

        // ================= REAL BETIS =================
        jugadores.add(new Jugador("Rui Silva", Posicion.PORTERO, 12000000, 2500000, "Betis"));
        jugadores.add(new Jugador("Claudio Bravo", Posicion.PORTERO, 2000000, 1500000, "Betis"));

        jugadores.add(new Jugador("Héctor Bellerín", Posicion.DEFENSA, 8000000, 3000000, "Betis"));
        jugadores.add(new Jugador("Germán Pezzella", Posicion.DEFENSA, 9000000, 2800000, "Betis"));
        jugadores.add(new Jugador("Marc Bartra", Posicion.DEFENSA, 7000000, 2600000, "Betis"));
        jugadores.add(new Jugador("Juan Miranda", Posicion.DEFENSA, 6000000, 2000000, "Betis"));
        jugadores.add(new Jugador("Aitor Ruibal", Posicion.DEFENSA, 6000000, 1500000, "Betis"));

        jugadores.add(new Jugador("Guido Rodríguez", Posicion.CENTROCAMPISTA, 18000000, 3500000, "Betis"));
        jugadores.add(new Jugador("William Carvalho", Posicion.CENTROCAMPISTA, 10000000, 4000000, "Betis"));
        jugadores.add(new Jugador("Isco", Posicion.CENTROCAMPISTA, 18000000, 3000000, "Betis"));
        jugadores.add(new Jugador("Rodri Sánchez", Posicion.CENTROCAMPISTA, 7000000, 1800000, "Betis"));

        jugadores.add(new Jugador("Borja Iglesias", Posicion.DELANTERO, 12000000, 3500000, "Betis"));
        jugadores.add(new Jugador("Ayoze Pérez", Posicion.DELANTERO, 14000000, 3200000, "Betis"));
        jugadores.add(new Jugador("Luiz Henrique", Posicion.DELANTERO, 22000000, 2800000, "Betis"));
        jugadores.add(new Jugador("Abde", Posicion.DELANTERO, 16000000, 2500000, "Betis"));


        // ================= REAL MADRID =================
        jugadores.add(new Jugador("Courtois", Posicion.PORTERO, 45000000, 15000000, "Real Madrid"));
        jugadores.add(new Jugador("Lunin", Posicion.PORTERO, 8000000, 2000000, "Real Madrid"));

        jugadores.add(new Jugador("Carvajal", Posicion.DEFENSA, 10000000, 6000000, "Real Madrid"));
        jugadores.add(new Jugador("Militao", Posicion.DEFENSA, 60000000, 9000000, "Real Madrid"));
        jugadores.add(new Jugador("Rüdiger", Posicion.DEFENSA, 35000000, 10000000, "Real Madrid"));
        jugadores.add(new Jugador("Alaba", Posicion.DEFENSA, 30000000, 11000000, "Real Madrid"));
        jugadores.add(new Jugador("Nacho", Posicion.DEFENSA, 5000000, 5000000, "Real Madrid"));

        jugadores.add(new Jugador("Kroos", Posicion.CENTROCAMPISTA, 15000000, 12000000, "Real Madrid"));
        jugadores.add(new Jugador("Modric", Posicion.CENTROCAMPISTA, 10000000, 10000000, "Real Madrid"));
        jugadores.add(new Jugador("Valverde", Posicion.CENTROCAMPISTA, 90000000, 8000000, "Real Madrid"));
        jugadores.add(new Jugador("Bellingham", Posicion.CENTROCAMPISTA, 180000000, 12000000, "Real Madrid"));

        jugadores.add(new Jugador("Vinicius Jr", Posicion.DELANTERO, 200000000, 15000000, "Real Madrid"));
        jugadores.add(new Jugador("Rodrygo", Posicion.DELANTERO, 110000000, 9000000, "Real Madrid"));
        jugadores.add(new Jugador("Joselu", Posicion.DELANTERO, 5000000, 3000000, "Real Madrid"));
        jugadores.add(new Jugador("Brahim Díaz", Posicion.DELANTERO, 25000000, 4000000, "Real Madrid"));


        // ================= FC BARCELONA =================
        jugadores.add(new Jugador("Ter Stegen", Posicion.PORTERO, 30000000, 9000000, "Barcelona"));
        jugadores.add(new Jugador("Iñaki Peña", Posicion.PORTERO, 5000000, 1500000, "Barcelona"));

        jugadores.add(new Jugador("Araújo", Posicion.DEFENSA, 70000000, 7000000, "Barcelona"));
        jugadores.add(new Jugador("Koundé", Posicion.DEFENSA, 60000000, 8000000, "Barcelona"));
        jugadores.add(new Jugador("Christensen", Posicion.DEFENSA, 35000000, 6000000, "Barcelona"));
        jugadores.add(new Jugador("Balde", Posicion.DEFENSA, 50000000, 5000000, "Barcelona"));
        jugadores.add(new Jugador("Sergi Roberto", Posicion.DEFENSA, 4000000, 4000000, "Barcelona"));

        jugadores.add(new Jugador("De Jong", Posicion.CENTROCAMPISTA, 65000000, 14000000, "Barcelona"));
        jugadores.add(new Jugador("Pedri", Posicion.CENTROCAMPISTA, 100000000, 8000000, "Barcelona"));
        jugadores.add(new Jugador("Gavi", Posicion.CENTROCAMPISTA, 90000000, 7000000, "Barcelona"));
        jugadores.add(new Jugador("Gündogan", Posicion.CENTROCAMPISTA, 20000000, 10000000, "Barcelona"));

        jugadores.add(new Jugador("Lewandowski", Posicion.DELANTERO, 30000000, 20000000, "Barcelona"));
        jugadores.add(new Jugador("Raphinha", Posicion.DELANTERO, 50000000, 6000000, "Barcelona"));
        jugadores.add(new Jugador("Ferran Torres", Posicion.DELANTERO, 35000000, 6000000, "Barcelona"));
        jugadores.add(new Jugador("Lamine Yamal", Posicion.DELANTERO, 120000000, 2000000, "Barcelona"));


        // ================= ATLÉTICO DE MADRID =================
        jugadores.add(new Jugador("Jan Oblak", Posicion.PORTERO, 40000000, 10000000, "Atletico Madrid"));
        jugadores.add(new Jugador("Grbic", Posicion.PORTERO, 4000000, 1500000, "Atletico Madrid"));

        jugadores.add(new Jugador("Giménez", Posicion.DEFENSA, 28000000, 6000000, "Atletico Madrid"));
        jugadores.add(new Jugador("Savic", Posicion.DEFENSA, 20000000, 7000000, "Atletico Madrid"));
        jugadores.add(new Jugador("Hermoso", Posicion.DEFENSA, 18000000, 5000000, "Atletico Madrid"));
        jugadores.add(new Jugador("Reinildo", Posicion.DEFENSA, 12000000, 3000000, "Atletico Madrid"));
        jugadores.add(new Jugador("Molina", Posicion.DEFENSA, 25000000, 4000000, "Atletico Madrid"));

        jugadores.add(new Jugador("Koke", Posicion.CENTROCAMPISTA, 20000000, 8000000, "Atletico Madrid"));
        jugadores.add(new Jugador("De Paul", Posicion.CENTROCAMPISTA, 35000000, 7000000, "Atletico Madrid"));
        jugadores.add(new Jugador("Saúl", Posicion.CENTROCAMPISTA, 15000000, 6000000, "Atletico Madrid"));
        jugadores.add(new Jugador("Llorente", Posicion.CENTROCAMPISTA, 45000000, 6000000, "Atletico Madrid"));

        jugadores.add(new Jugador("Griezmann", Posicion.DELANTERO, 60000000, 14000000, "Atletico Madrid"));
        jugadores.add(new Jugador("Morata", Posicion.DELANTERO, 25000000, 7000000, "Atletico Madrid"));
        jugadores.add(new Jugador("Correa", Posicion.DELANTERO, 30000000, 5000000, "Atletico Madrid"));
        jugadores.add(new Jugador("Memphis", Posicion.DELANTERO, 20000000, 9000000, "Atletico Madrid"));


        // ================= SEVILLA =================
        jugadores.add(new Jugador("Dmitrovic", Posicion.PORTERO, 6000000, 2500000, "Sevilla"));
        jugadores.add(new Jugador("Nyland", Posicion.PORTERO, 2000000, 1200000, "Sevilla"));

        jugadores.add(new Jugador("Sergio Ramos", Posicion.DEFENSA, 5000000, 6000000, "Sevilla"));
        jugadores.add(new Jugador("Navas", Posicion.DEFENSA, 3000000, 4000000, "Sevilla"));
        jugadores.add(new Jugador("Badé", Posicion.DEFENSA, 25000000, 3500000, "Sevilla"));
        jugadores.add(new Jugador("Acuña", Posicion.DEFENSA, 12000000, 5000000, "Sevilla"));
        jugadores.add(new Jugador("Gudelj", Posicion.DEFENSA, 9000000, 3000000, "Sevilla"));

        jugadores.add(new Jugador("Rakitic", Posicion.CENTROCAMPISTA, 6000000, 7000000, "Sevilla"));
        jugadores.add(new Jugador("Soumaré", Posicion.CENTROCAMPISTA, 15000000, 3500000, "Sevilla"));
        jugadores.add(new Jugador("Óliver Torres", Posicion.CENTROCAMPISTA, 8000000, 3000000, "Sevilla"));
        jugadores.add(new Jugador("Suso", Posicion.CENTROCAMPISTA, 7000000, 4000000, "Sevilla"));

        jugadores.add(new Jugador("Ocampos", Posicion.DELANTERO, 25000000, 5000000, "Sevilla"));
        jugadores.add(new Jugador("En-Nesyri", Posicion.DELANTERO, 20000000, 4500000, "Sevilla"));
        jugadores.add(new Jugador("Mariano", Posicion.DELANTERO, 3000000, 5000000, "Sevilla"));
        jugadores.add(new Jugador("Lamela", Posicion.DELANTERO, 8000000, 6000000, "Sevilla"));

        // ================= VALENCIA CF =================
        jugadores.add(new Jugador("Mamardashvili", Posicion.PORTERO, 35000000, 3000000, "Valencia"));
        jugadores.add(new Jugador("Jaume Doménech", Posicion.PORTERO, 2000000, 1800000, "Valencia"));

        jugadores.add(new Jugador("Gayà", Posicion.DEFENSA, 20000000, 4000000, "Valencia"));
        jugadores.add(new Jugador("Diakhaby", Posicion.DEFENSA, 12000000, 2500000, "Valencia"));
        jugadores.add(new Jugador("Mosquera", Posicion.DEFENSA, 15000000, 2000000, "Valencia"));
        jugadores.add(new Jugador("Foulquier", Posicion.DEFENSA, 7000000, 2000000, "Valencia"));
        jugadores.add(new Jugador("Cenk Özkacar", Posicion.DEFENSA, 6000000, 1800000, "Valencia"));

        jugadores.add(new Jugador("Pepelu", Posicion.CENTROCAMPISTA, 18000000, 2500000, "Valencia"));
        jugadores.add(new Jugador("Javi Guerra", Posicion.CENTROCAMPISTA, 25000000, 2200000, "Valencia"));
        jugadores.add(new Jugador("André Almeida", Posicion.CENTROCAMPISTA, 12000000, 2000000, "Valencia"));
        jugadores.add(new Jugador("Fran Pérez", Posicion.CENTROCAMPISTA, 8000000, 1500000, "Valencia"));

        jugadores.add(new Jugador("Hugo Duro", Posicion.DELANTERO, 15000000, 2500000, "Valencia"));
        jugadores.add(new Jugador("Diego López", Posicion.DELANTERO, 12000000, 1800000, "Valencia"));
        jugadores.add(new Jugador("Yaremchuk", Posicion.DELANTERO, 9000000, 3000000, "Valencia"));
        jugadores.add(new Jugador("Alberto Marí", Posicion.DELANTERO, 4000000, 1200000, "Valencia"));


        // ================= VILLARREAL CF =================
        jugadores.add(new Jugador("Jörgensen", Posicion.PORTERO, 15000000, 2000000, "Villarreal"));
        jugadores.add(new Jugador("Pepe Reina", Posicion.PORTERO, 1000000, 1500000, "Villarreal"));

        jugadores.add(new Jugador("Foyth", Posicion.DEFENSA, 25000000, 4000000, "Villarreal"));
        jugadores.add(new Jugador("Albiol", Posicion.DEFENSA, 3000000, 3500000, "Villarreal"));
        jugadores.add(new Jugador("Cuenca", Posicion.DEFENSA, 5000000, 1800000, "Villarreal"));
        jugadores.add(new Jugador("Pedraza", Posicion.DEFENSA, 12000000, 3000000, "Villarreal"));
        jugadores.add(new Jugador("Mario Gaspar", Posicion.DEFENSA, 2000000, 2500000, "Villarreal"));

        jugadores.add(new Jugador("Parejo", Posicion.CENTROCAMPISTA, 8000000, 5000000, "Villarreal"));
        jugadores.add(new Jugador("Capoue", Posicion.CENTROCAMPISTA, 6000000, 4500000, "Villarreal"));
        jugadores.add(new Jugador("Baena", Posicion.CENTROCAMPISTA, 40000000, 3500000, "Villarreal"));
        jugadores.add(new Jugador("Trigueros", Posicion.CENTROCAMPISTA, 4000000, 3000000, "Villarreal"));

        jugadores.add(new Jugador("Gerard Moreno", Posicion.DELANTERO, 30000000, 6000000, "Villarreal"));
        jugadores.add(new Jugador("Sørloth", Posicion.DELANTERO, 25000000, 5000000, "Villarreal"));
        jugadores.add(new Jugador("Morales", Posicion.DELANTERO, 8000000, 4000000, "Villarreal"));
        jugadores.add(new Jugador("Yeremy Pino", Posicion.DELANTERO, 35000000, 4500000, "Villarreal"));


        // ================= REAL SOCIEDAD =================
        jugadores.add(new Jugador("Remiro", Posicion.PORTERO, 18000000, 3000000, "Real Sociedad"));
        jugadores.add(new Jugador("Moyá", Posicion.PORTERO, 1500000, 1200000, "Real Sociedad"));

        jugadores.add(new Jugador("Le Normand", Posicion.DEFENSA, 40000000, 4000000, "Real Sociedad"));
        jugadores.add(new Jugador("Zubeldia", Posicion.DEFENSA, 25000000, 3500000, "Real Sociedad"));
        jugadores.add(new Jugador("Aihen Muñoz", Posicion.DEFENSA, 12000000, 2500000, "Real Sociedad"));
        jugadores.add(new Jugador("Traoré", Posicion.DEFENSA, 10000000, 2800000, "Real Sociedad"));
        jugadores.add(new Jugador("Tierney", Posicion.DEFENSA, 18000000, 3500000, "Real Sociedad"));

        jugadores.add(new Jugador("Zubimendi", Posicion.CENTROCAMPISTA, 60000000, 5000000, "Real Sociedad"));
        jugadores.add(new Jugador("Merino", Posicion.CENTROCAMPISTA, 45000000, 5500000, "Real Sociedad"));
        jugadores.add(new Jugador("Brais Méndez", Posicion.CENTROCAMPISTA, 30000000, 4500000, "Real Sociedad"));
        jugadores.add(new Jugador("Turrientes", Posicion.CENTROCAMPISTA, 12000000, 2000000, "Real Sociedad"));

        jugadores.add(new Jugador("Oyarzabal", Posicion.DELANTERO, 45000000, 7000000, "Real Sociedad"));
        jugadores.add(new Jugador("Kubo", Posicion.DELANTERO, 50000000, 5000000, "Real Sociedad"));
        jugadores.add(new Jugador("André Silva", Posicion.DELANTERO, 15000000, 4000000, "Real Sociedad"));
        jugadores.add(new Jugador("Sadiq", Posicion.DELANTERO, 12000000, 3500000, "Real Sociedad"));

    }
}
