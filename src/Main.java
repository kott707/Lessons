


class Main {
    public static void main(String[] args) {

        //имеем 2конструктора, имя + счетчик по умолчанию, имя + счетчик
        Counter counter = new Counter("Clock",50);

        //положительное число увеличит, отрицательное уменьшит, 0 - предупреждение
        counter.increaseCounter(1);
        System.out.println("current " + counter.counter);

        counter.increase(1);
        System.out.println("current " + counter.counter);
        counter.icr();
        if(counter.counter >52) return;
        System.out.println("current " + counter.counter);





    }
}

class Counter {
    int counter;
    private String nameCounter;

    {
        counter = 0;
    }

    public Counter( String nameCounter, int counter) {
        this.counter = counter;
        this.nameCounter = nameCounter;
    }

    public Counter(String nameCounter) {
        this(nameCounter,0);
    }

    public int increase( int value){
        counter += value;

        return counter;
    }

    public int icr(){

        return counter++;
    }

    //не делал return, так как в данной задачи нет применения возвращаемого по return, а только вывод в консоль
    public void increaseCounter(int setNumber){

        if (setNumber > 0) {
            counter +=setNumber;
            System.out.println("Счетчик увеличен на "+setNumber+" Текущее значение = "+counter);
        } else if (setNumber == 0){
            System.out.println("Вы ввели "+setNumber+" и счетчик не изменился [ "+counter+" ]");
        } else {
            counter -=setNumber;
            System.out.println("Счетчик уменьшен на "+setNumber+" Текущее значение = "+counter);
        }
    }

    public void checkEvenness(int fromNumber, int toNumber){

        int evenNumberCount = 0;
        int oddNumberCount = 0;

        for (int i = fromNumber; i <= toNumber; i++){
            if(i%2 == 0) {
                evenNumberCount++;
            }else {
                oddNumberCount++;
            }
        }
        System.out.println("Нечетные числа: "+oddNumberCount+"\nЧетные числа: "+evenNumberCount);
    }

}


