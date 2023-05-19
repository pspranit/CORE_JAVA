enum SingletonEnum
{
    PRANIT;
    int value=10;

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value=value;
    }
}
class Main {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.PRANIT;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}
