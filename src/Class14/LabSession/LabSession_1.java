package Class14.LabSession;

public class LabSession_1 {
    public static void main(String[] args) {

        /**
         * {3, 12, 56, 8}
         *
         * picked-index-0-value (i=0)
         *  if (index-1-value < index-0-value) (j=i+1)
         *      index-0 = index-1-value
         *      index-1 = index-0-value
         *
         *  if (index-2-value < index-0-value)
         *      index-0 = index-2-value
         *      index-2 = index-0-value
         *
         *  if (index-3-value < index-0-value)
         *      index-0 = index-3-value
         *      index-3 = index-0-value
         * {3, 12, 56, 8}
         *
         * picked-index-1-value
         *  if (index-2-value < index-1-value)
         *      index-1 = index-2-value
         *      index-2 = index-1-value
         *
         *  if (index-3-value < index-3-value)
         *      index-1 = index-3-value
         *      index-3 = index-1-value
         * {3, 8, 56, 12}
         *
         * picked-index-2-value (i < len-1)
         * if (index-3-value < index-2-value) (j < len)
         *  index-3 = index-2-value
         *  index-2 = index-3-value
         * {3, 8, 12, 56}
         *
         *
         *
         */

    }
}
