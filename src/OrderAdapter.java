class OrderAdapter implements NewOrderProcessor {
    private LegacyOrderProcessor legacyOrderProcessor;

    OrderAdapter(LegacyOrderProcessor legacyOrderProcessor) {
        this.legacyOrderProcessor = legacyOrderProcessor;
    }

    public void processNewOrder() {
        legacyOrderProcessor.processLegacyOrder();
    }
}