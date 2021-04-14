public class FizzBuzzTranslate {
    private int number;
    public FizzBuzzTranslate() {
    }
    public FizzBuzzTranslate(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public boolean checkDigit(char digit){
        for (int i=0;i< String.valueOf(number).length();i++){
            if (String.valueOf(number).charAt(i)==digit){
                return true;
            }
        }
        return false;
    }
    public boolean checkDivision(int dividend){
        if (number%dividend==0){
            return true;
        }
        return false;
    }
    public String getFizzBuzz(){
        String text = " ";
        if (checkDivision(3)||checkDigit('3')){
             text+="Fizz";
        }
        if (checkDivision(5)||checkDigit('5')){
             text+="Buzz";
        }
        if (text==" "){
             text = String.valueOf(number);
        }
        return text;
    }
    public String translateOne(int index){
        if (index ==0){
            if (number<10){
                return "Một ";
            }else{
                return "Mười ";
            }
        }else {
            if (number<20){
                return "một";
            }else {
                return "mốt";
            }
        }
    }
    public String translateZero(int index){
        if (index==0){
            return "Không ";
        }else{
            if(number<20){
                return " ";
            }else {
                return "mươi";
            }
        }
    }
    public String translateFour(int index){
        if (index==0){
            return "Bốn ";
        }else {
            if (number<20){
                return "bốn";
            }else {
                return "tư";
            }
        }
    }
    public String translate(){
        String str=" ";
        for (int i=0;i<String.valueOf(number).length();i++){
            switch (String.valueOf(number).charAt(i)){
                case '0':
                    str+=translateZero(i);
                    break;
                case '1':
                    str+=translateOne(i);
                    break;
                case '2':
                    str+= "Hai ";
                    break;
                case '3':
                    str+= "Ba ";
                    break;
                case '4':
                    str+= translateFour(i);
                    break;
                case '5':
                    str+= "Năm ";
                    break;
                case '6':
                    str+= "Sáu ";
                    break;
                case '7':
                    str+= "Bảy ";
                    break;
                case '8':
                    str+= "Tám ";
                    break;
                case '9':
                    str+= "Chín ";
                    break;
                default:
                    str+="";
            }
        }
        return str;
    }
}
