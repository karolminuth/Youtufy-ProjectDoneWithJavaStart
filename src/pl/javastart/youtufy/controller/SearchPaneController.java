package pl.javastart.youtufy.controller;
 
import java.net.URL;
import java.util.ResourceBundle;
 
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
 
public class SearchPaneController implements Initializable {
 
    @FXML
    private TextField searchTextField;
 
    @FXML
    private ListView<String> historyListView;
    
    public TextField getSearchTextField() {
		return searchTextField;
	}

	public void setSearchTextField(TextField searchTextField) {
		this.searchTextField = searchTextField;
	}

	public ListView<String> getHistoryListView() {
		return historyListView;
	}

	public void setHistoryListView(ListView<String> historyListView) {
		this.historyListView = historyListView;
	}
 
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // dodajemy zdarzenie do pola tekstowego
        // klasa anonimowa, poniewa¿ jest nieco rozbudowane
        getSearchTextField().addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
 
            @Override
            public void handle(KeyEvent event) {
 
                // zapisujemy do zmiennej wartoœæ z pola wyszukiwania
                String searchQuery = getSearchTextField().getText();
                ObservableList<String> historyList = getHistoryListView().getItems();
 
                // jeœli wciœniêto Enter
                if (event.getCode().equals(KeyCode.ENTER)) {
 
                    // sprawdzamy, element nie by³ ju¿ dodany do listy jako
                    // ostatni
                    if (historyList.isEmpty() || !historyList.get(0).equals(searchQuery)) {
                        historyList.add(0, searchQuery);
                    }
 
                }
            }
        });
    }
}