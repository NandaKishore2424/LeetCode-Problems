class Solution {
    
        final static String[] digits = {
            "", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ","Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen ", "Twenty "
        };

        final static String[] tens = {
            "", "Ten ", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "
        };

        final static String[] powers = {
            "Hundred ", "Thousand ", "Million ", "Billion " 
        };

    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        StringBuilder word = new StringBuilder();
        toEng(num, word);
        return word.toString().trim();
    }
    private void toEng(int num, StringBuilder w){
        if(num <= 20){
            w.append(digits[num]);
        }else if(num < 100){
            w.append(tens[(num - num%10)/10]);
            w.append(digits[num%10]);
        }else if(num < 1000){
            w.append(digits[(num - num%100)/100]);
            w.append(powers[0]);
            toEng(num%100, w);
        }else if(num < 1000_000){
            toEng((num - num%1000)/1000, w);
            w.append(powers[1]);
            toEng(num%1000, w);
        }else if(num < 1000_000_000){
            toEng((num - num%1000_000)/1000_000, w);
            w.append(powers[2]);
            toEng(num%1000_000, w);
        }else if(num <= Integer.MAX_VALUE){
            toEng((num - num%1000_000_000)/1000_000_000, w);
            w.append(powers[3]);
            toEng(num%1000_000_000, w);
        }
    }
}