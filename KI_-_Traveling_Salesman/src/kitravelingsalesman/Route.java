package kitravelingsalesman;
import java.util.ArrayList;
import java.util.Random;


public class Route {
    private ArrayList<City> cities;               
    private City[][] chromosom;                    
    private int population, generation, numCities, mutationsrate;
    private static Random rn = new Random();        
    private float totaldistance;
                    
    public Route(ArrayList cities, int numPop) {
        this.cities = cities;
        numCities = cities.size();
        population = numPop;
        chromosom = new City[population][numCities];
        initPopulation();
    }
    /**
     *Generates a random placement
     * */
     
    private int[] mix() {
        int[] places = new int[numCities];
        int place = 0;
        boolean isFree;                            
        for(int i = 0; i < numCities; i++)
            places[i] = 0;

        for(int i = 1; i < numCities; i++) {
            isFree = false;
            while(isFree == false) {
                isFree = true;
                place = rn.nextInt(numCities-1);
                for(int j=1; j < numCities; j++) {
                    if(places[j] == place+1) {
                        isFree = false;            
                        break;
                    }
                }
            }
            places[i] = place+1;
        }
        return places;
    }
    /**
     * Initializing the population
     */
    private void initPopulation() {
        int[] places = new int[numCities];
        for(int p = 0; p < population; p++) {
            places = mix();
            /* Platzvergabe innerhalb der Population */
            for(int j=0; j < numCities; j++) {
                chromosom[p][places[j]] = cities.get(j);
            }                    
        }
    }
    /**
     * Traveling Salesman Algorithm
     */
    public City[] travelingSalesman() { 
        City tmp = new City();
        int best = 0;
        int middle;
        
        if(chromosom[0].length%2 > 0)
            middle = (chromosom[0].length/2)-1;
        else
            middle = chromosom[0].length/2;
        
        
        for(int g = 0; g < generation; g++) {
            best = 0;                  // Best Chromosome
            
            /* Finding best chromosome */
            for(int p=1; p < population; p++) {
                if(fitness(chromosom[best]) > fitness(chromosom[p])) {
                    best = p;
                }
            }
            /* Reproduction */
            for(int p = 0; p < population; p++) {
               City[] new_gen = new City[numCities];
                int[] cities = new int[numCities-1];
                cities = mix();
                if(p != best) {
                    /* >> RECOMBINATION */
                    if(rn.nextBoolean()) {
                        /* Left half of the best in
                           current integrated into chromosome*/
                        boolean available;                        
                        int place = 0;
                        /* Left replace*/
                        for(int n=0; n < middle; n++) {
                            new_gen[n] = chromosom[best][n];
                            place++;
                        }
                        /* Check the right half duplicate entries and correct it */
                        for(int k=0; k < numCities; k++) {
                            available = false;
                            int i = 0;
                            while(new_gen[i] != null) {
                                    if(new_gen[i] == chromosom[p][k]) {
                                        available = true;
                                        break;
                                    } else {
                                        i++;
                                    }
                            }
                            if(!available) {
                                new_gen[i] = chromosom[p][k];
                            }
                        }
                    } else {
                        /* Integrate right half of the best in recent chromosome */
                        
                        boolean available;
                        int place = numCities-1;
                        /* Rights replace page*/
                        for(int n=numCities-1; n > middle; n--) {
                            new_gen[n] = chromosom[best][n];
                            place--;
                        }
                        /* Check left half Duplicate entries and correct */
                        
                        for(int k=0; k < numCities; k++) {
                            available = false;
                            int i = numCities-1;
                            while(new_gen[i] != null) {
                                    if(new_gen[i] == chromosom[p][k]) {
                                        available = true;
                                        break;
                                    } else {
                                        i--;
                                    }
                            }
                            if(!available) {
                                new_gen[i] = chromosom[p][k];
                            }
                        }
                    }
                            chromosom[p] = new_gen;
                    /** 
                     * >> MUTATION
                     * Swap two elements together
                     */
                    int from, to;
                    if(rn.nextInt(99) < mutationsrate-1) {
                        do {
                            from = rn.nextInt(numCities);
                            to = rn.nextInt(numCities);
                        } while(from == to);

                        /* Beide vertauschen */
                        tmp = chromosom[p][from];
                        chromosom[p][from] = chromosom[p][to];
                        chromosom[p][to] = tmp;
                    }
                }
            }
            // Fitness spend on console
            System.out.println("Generation[" + g + "], Fitness: " 
                    + fitness(chromosom[best]));
            if(g == generation-1)
                setTotalDistance(fitness(chromosom[best]));
        }
        return chromosom[best];
    }
    /**
     * Checks the fitness of a chromosome
     */
    private float fitness(City[] locations) {
        float scale = (float)2.25;   // Scale of the map
        float distance = 0;              // Total distance
        double stretch;              // Distance between locations A and B
        double dx, dy;                  // Delta-x/y as Catheti
        City[] chromosom = new City[numCities];
        chromosom = locations;

        for(int i = 0; i < numCities-1; i++) {
            /* Pythagoras sum */
            dx = (chromosom[i].x - chromosom[i+1].x);
            dy = (chromosom[i].y - chromosom[i+1].y);
            stretch = Math.abs(Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)));
            distance += stretch;
        }
        dx = (chromosom[0].x - chromosom[numCities-1].x);
        dy = (chromosom[0].y - chromosom[numCities-1].y);
        stretch = Math.abs(Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)));
        distance += stretch;
        return distance*scale;
    }
    
    public float getTotalDistance() {
        return totaldistance;
    }
    public void setTotalDistance(float totaldistance) {
        this.totaldistance = totaldistance;
    }
    public void setGeneration(int generation) {
        this.generation = generation;
    }
    public void setMutationsrate(int mutationsrate) {
    this.mutationsrate = mutationsrate;
    }
}
