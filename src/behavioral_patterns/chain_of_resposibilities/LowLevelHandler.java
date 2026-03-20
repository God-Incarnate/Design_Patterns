package behavioral_patterns.chain_of_resposibilities;

class LowLevelHandler extends Handler {

    public void handleRequest(int request) {

        if(request <= 10) {
            System.out.println("LowLevelHandler handled request: " + request);
        }
        else if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
