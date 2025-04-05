public class TransactionIdExtractor {

    public static String extractTransactionId(String html) {

        String marker = "Transaction Id: ";
        int startIndex = html.indexOf(marker);

        if (startIndex == -1) {
            return "Transaction ID not found";
        }

        startIndex += marker.length();

        // Find the end of the ID (next closing tag </p>)
        int endIndex = html.indexOf("</p>", startIndex);
        if (endIndex == -1) {
            return "Invalid HTML format";
        }

        // Extract the substring between start and end
        String transactionId = html.substring(startIndex, endIndex).trim();
        return transactionId;
    }

    public static void main(String[] args) {
        // The HTML content as a string
        String html = """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Transactions</title>
            </head>
            <body>
                <div>
                    <div class="button">
                        <p>Transaction Id: TXN1234</p>
                    </div>
                </div>
            </body>
            </html>
            """;


        String transactionId = extractTransactionId(html);
        System.out.println("Transaction ID: " + transactionId);
    }
}