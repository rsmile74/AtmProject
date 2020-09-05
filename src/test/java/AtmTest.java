

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class AtmTest {

    @Test
    public void shouldHaveABalanceof50() {
        //Arrange
        Atm underTest = new Atm(50, "1234");
        //Act
        int actualBalance = underTest.getBalance();
        //Assert
        assertEquals(actualBalance, (50));
    }

    @Test
    public void ShouldHaveABalanceof100() {
        Atm underTest = new Atm(100, "1234");
        int actualBalance = underTest.getBalance();
        assertEquals(actualBalance, (100));
    }

    @Test
    public void depoistOf50ShouldIncreaseAnInitialBalanceOf50To100() {
        Atm underTest = new Atm(50, "1234");
        underTest.deposit(50);
        int actualBalance = underTest.getBalance();
        assertEquals(actualBalance, (100));
    }

    @Test
    public void depositOf100ShouldIncreaseAnInitialBalanceOf100To200() {
        Atm underTest = new Atm(100, "1234");
        underTest.deposit(100);
        int actualBalance = underTest.getBalance();
        assertEquals(actualBalance, (200));
    }

    @Test
    public void withdrawalOf50ShouldDecreaseAnInitialBalanceOf100To50() {
        Atm underTest = new Atm(100, "1234");
        underTest.withdrawal(50);
        int actualBalance = underTest.getBalance();
        assertEquals(actualBalance, (50));
    }

    @Test
    public void withdrawalOf100ShouldDecreaseAnInitialBalanceOf50By0(){
        Atm underTest = new Atm(50, "1234");
        underTest.withdrawal(100);
        int actualBalance = underTest.getBalance();
        assertEquals(actualBalance, (50));
    }

    @Test
    public void shouldAllowUserAccessWithCorrectPin(){
       Atm underTest = new Atm(50, "1234");
       boolean accessResult = underTest.accessAccount("1234");
        assertEquals(accessResult, (true));
    }

    @Test
    public void shouldDenyUserAccessWithInCorrectPin() {
        Atm underTest = new Atm(50, "1234");
        boolean accessResult = underTest.accessAccount("1111");
        assertEquals(accessResult, (false));

    }



    }



