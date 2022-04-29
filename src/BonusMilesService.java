public class BonusMilesService {
    public int calculate(int cost) {
        int bonus = 20; //Количество рублей для одной бонусной мили
        int miles = (cost / bonus);
        return miles;
    }
}