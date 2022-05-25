public class OperationValidator {

    public static void validateOperation(double value, Account sourceAccount)
        throws InvalidOperationException{
            if(value > sourceAccount.getAmount())
                throw new InvalidOperationException("Insufficient funds! Operation can't be done.");
    }
}
