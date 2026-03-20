package behavioral_patterns.chain_of_resposibilities;

class HighLevelHandler extends Handler {

    public void handleRequest(int request) {

        if(request > 20) {
            System.out.println("HighLevelHandler handled request: " + request);
        }
        else if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
