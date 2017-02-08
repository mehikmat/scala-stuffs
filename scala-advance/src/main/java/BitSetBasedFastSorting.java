import java.util.BitSet;

/**
 * Created by hdhamee on 2/6/17.
 */
public class BitSetBasedFastSorting {

    public static void main(String[] args) {
        int[] array = new int[]{1,9,15};

        long start = System.currentTimeMillis();

        BitSet bits = new BitSet(2);
        for ( int i = 0; i < array.length; ++ i ) {
            bits.set( array[i] );
        }

        int lastBit = 0;
        int i = 0;
        while ( true ) {
            lastBit = bits.nextSetBit(lastBit );
            if ( lastBit == -1 ) {
                break;
            }
            array[i] = lastBit;
            ++ lastBit;
            ++ i;
        }


        System.err.println("took1 " + ( System.currentTimeMillis() - start )  );

    }
}
