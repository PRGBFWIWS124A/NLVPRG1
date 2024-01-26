public class Battleship {

static final int SIZE = 10;

public static void main (String[]args){
}
// Aufgabe A fur Programm
static int distance (final Coordinate start, final Coordinate end){

    return Math.abs(start.column()-end.column())+ Math.abs(start.row()-end.row());
}

// Aufgabe B fur Programm
static Coordinate getRandomCoordinate(int Random){
   

return new Coordinate (Utility.getRandomInt(SIZE), Utility.getRandomInt(SIZE) );

}

// Aufgabe C fur Programm
static boolean onOneLine(final Coordinate start, final Coordinate end){

    return(start.column() == end.column() || start.row() == end.row());
}

// Aufgabe D fur Programm
static void showSeparatorLine(){

    System.out.println("   +-+-+-+-+-+-+-+-+-+-+      +-+-+-+-+-+-+-+-+-+-+");

}

// Aufgabe E fur Programm

static int getMaxSurroundingColumn(final Coordinate start, final Coordinate end){

    

}

static int getMaxSurroundingRow(final Coordinate start, final Coordinate end);

static int getMinSurroundingColumn(final Coordinate start, final Coordinate end);

static int getMinSurroundingRow(final Coordinate start, final Coordinate end);




}
