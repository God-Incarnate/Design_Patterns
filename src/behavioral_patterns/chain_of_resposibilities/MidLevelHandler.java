package behavioral_patterns.chain_of_resposibilities;

class MidLevelHandler extends Handler {

    public void handleRequest(int request) {

        if(request <= 20) {
            System.out.println("MidLevelHandler handled request: " + request);
        }
        else if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
