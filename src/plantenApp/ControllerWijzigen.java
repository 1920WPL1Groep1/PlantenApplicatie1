package plantenApp;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.*;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import plantenApp.java.dao.*;
import plantenApp.java.model.*;
import plantenApp.java.dao.Database;
import plantenApp.java.dao.InfoTablesDAO;
import plantenApp.java.model.AbiotischeFactoren;
import plantenApp.java.model.Commensalisme;
import plantenApp.java.model.InfoTables;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import static plantenApp.ControllerPlantToevoegen.*;

public class ControllerWijzigen {
    public Slider slNectarwaardeWz;
    public Label NectarwaardeValueTv;
    public Slider slPollenwaardeWz;
    public Label PollenValueTv;
    public RadioButton rbBijvriendelijkNullWz;
    public ToggleGroup BijvriendelijkGroepTv;
    public RadioButton rbBijvriendelijkJaWz;
    public RadioButton rbBijvriendelijkNeeWz;
    public RadioButton rbVlindervriendelijkNullWz;
    public RadioButton rbVlindervriendelijkJaWz;
    public RadioButton rbVlindervriendelijkNeeWz;
    public ToggleGroup VlindervriendelijkGroepTv;
    public RadioButton rbEetbaarNullWz;
    public ToggleGroup EetbaarGroepTv;
    public RadioButton rbEetbaarJaWz;
    public RadioButton rbEetbaarNeeWz;
    public RadioButton rbKruidgebruikNullWz;
    public ToggleGroup KruidgebruikGroepTv;
    public RadioButton rbKruidgebruikJaWz;
    public RadioButton rbKruidgebruikNeeWz;
    public RadioButton rbGeurendNullWz;
    public RadioButton rbGeurendJaWz;
    public RadioButton rbGeurendNeeWz;
    public RadioButton rbVorstgevoeligNullWz;
    public ToggleGroup VorstgevoeligGroepTv;
    public RadioButton rbVorstgevoeligJaWz;
    public RadioButton rbVorstgevoeligNeeWz;
    public ListView lvLevensduurTv;
    public ComboBox cbLevensduurTv;
    public ComboBox cbLevensduurWz;
    public ComboBox cbBladkleurJanWz;
    public ComboBox cbBladkleurFebWz;
    public ComboBox cbBladkleurMaaWz;
    public ComboBox cbBladkleurAprWz;
    public ComboBox cbBladkleurMeiWz;
    public ComboBox cbBladkleurJunWz;
    public ComboBox cbBladkleurJulWz;
    public ComboBox cbBladkleurAugWz;
    public ComboBox cbBladkleurSeptWz;
    public ComboBox cbBladkleurOktWz;
    public ComboBox cbBladkleurNovTv;
    public ComboBox cbBladkleurDecTv;
    public ComboBox cbBloeikleurJanWz;
    public ComboBox cbBloeikleurFebWz;
    public ComboBox cbBloeikleurMaaWz;
    public ComboBox cbBloeikleurAprWz;
    public ComboBox cbBloeikleurMeiWz;
    public ComboBox cbBloeikleurJunWz;
    public ComboBox cbBloeikleurJulWz;
    public ComboBox cbBloeikleurAugWz;
    public ComboBox cbBloeikleurSeptWz;
    public ComboBox cbBloeikleurOktWz;
    public ComboBox cbBloeikleurNovTv;
    public ComboBox cbBloeikleurDecTv;
    public ComboBox <String> cbBezonningWz;
    public ComboBox <String> cbVoedingsbehoefteWz;
    public ComboBox <String> cbVochtbehoefteWz;
    public ComboBox <String> cbReactieAntaWz;
    public ComboBox <String> cbGrondsoortWz;
    public ComboBox cbHabitatWz;
    public ComboBox <String> cbOntwikkelingssnelheidWz;
    public Button btnHabitatWz;
    public Button btnHabitatWzVerwijderen;
    public ListView lvHabitatWz;
    public RadioButton rbTuftedWz;
    public ToggleGroup HabitusGroepWz;
    public RadioButton rbUprightarchingWz;
    public RadioButton rbArchingWz;
    public RadioButton rbUprightDivergentWz;
    public RadioButton rbUprightErectWz;
    public RadioButton rbMountedWz;
    public RadioButton rbKOfHGOfMWz;
    public RadioButton rbRondOfWaaiervormigWz;
    public RadioButton rbKussenvormendWz;
    public RadioButton rbZuilvormigWz;
    public RadioButton rbUitbuigendWz;
    public RadioButton rbWortelrozetplantWz;
    public RadioButton rbSucculentenWz;
    public RadioButton rbPollenvormersWz;
    public RadioButton rbParasolvormigWz;
    public RadioButton rbAarWz;
    public RadioButton rbBredePluimWz;
    public RadioButton rbEtageWz;
    public RadioButton rbBolOfKnopWz;
    public RadioButton rbMargrietachtigWz;
    public RadioButton rbSchotelWz;
    public RadioButton rbSchermWz;
    public RadioButton rbSmallePluimWz;
    public RadioButton rbStrategieUnknownTv;
    public ToggleGroup StrategieGroepTv;
    public RadioButton rbStrategieTopWz;
    public RadioButton rbStrategieLMWz;
    public RadioButton rbStrategieMMWz;
    public RadioButton rbStrategieRMWz;
    public RadioButton rbStrategieLOWz;
    public RadioButton rbStrategieMOWz;
    public RadioButton rbStrategieROWz;
    public CheckBox chkSociabiliteit1Wz;
    public CheckBox chkSociabiliteit2Wz;
    public CheckBox chkSociabiliteit3Wz;
    public CheckBox chkSociabiliteit4Wz;
    public CheckBox chkSociabiliteit5Wz;
    private InfoTables infoTables;
    private Connection dbConnection;
    public ComboBox cboTypeWz;
    public TextField txtFamilieWz;
    public TextField txtGeslachtWz;
    public TextField txtSoortWz;
    public TextField txtVariantWz;
    public TextField txtDichtheidXWz;
    public TextField txtDichtheidYWz;
    public ComboBox <String> cbBladgrootteTotWz;
    public ComboBox <String> cbBladvormWz;
    public ComboBox <String> cbRatioWz;
    public ComboBox <String> cbSpruitfenologieWz;
    public RadioButton rbHydro1Wz;
    public RadioButton rbHydro2Wz;
    public RadioButton rbHeloWz;
    public RadioButton rbCrypto1Wz;
    public ToggleGroup LevensvormGroepTv;
    public RadioButton rbCrypto2Wz;
    public RadioButton rbHemikryptoWz;
    public RadioButton rbChamae1Wz;
    public RadioButton rbChamae2Wz;
    public RadioButton rbFaneroWz;
    public Spinner spinMaxBladhJanWz;
    public Spinner spinMaxBladhFebWz;
    public Spinner spinMaxBladhMaaWz;
    public Spinner spinMaxBladhAprWz;
    public Spinner spinMaxBladhMeiWz;
    public Spinner spinMaxBladhJunWz;
    public Spinner spinMaxBladhJulWz;
    public Spinner spinMaxBladhAugWz;
    public Spinner spinMaxBladhSeptWz;
    public Spinner spinMaxBladhOktWz;
    public Spinner spinMaxBladhNovWz;
    public Spinner spinMaxBladhDecWz;
    public ComboBox cbBladkleurNovWz;
    public ComboBox cbBladkleurDecWz;
    public Spinner spinMinBloeihJanWz;
    public Spinner spinMinBloeihFebWz;
    public Spinner spinMinBloeihMaaWz;
    public Spinner spinMinBloeihAprWz;
    public Spinner spinMinBloeihMeiWz;
    public Spinner spinMinBloeihJunWz;
    public Spinner spinMinBloeihJulWz;
    public Spinner spinMinBloeihAugWz;
    public Spinner spinMinBloeihSeptWz;
    public Spinner spinMinBloeihOktWz;
    public Spinner spinMinBloeihNovWz;
    public Spinner spinMinBloeihDecWz;
    public Spinner spinMaxBloeihJanWz;
    public Spinner spinMaxBloeihFebWz;
    public Spinner spinMaxBloeihMaaWz;
    public Spinner spinMaxBloeihAprWz;
    public Spinner spinMaxBloeihMeiWz;
    public Spinner spinMaxBloeihJunWz;
    public Spinner spinMaxBloeihJulWz;
    public Spinner spinMaxBloeihAugWz;
    public Spinner spinMaxBloeihSeptWz;
    public Spinner spinMaxBloeihOktWz;
    public Spinner spinMaxBloeihNovWz;
    public Spinner spinMaxBloeihDecWz;
    public ComboBox cbBloeikleurNovWz;
    public ComboBox cbBloeikleurDecWz;
    public RadioButton rbStrategieUnknownWz;
    public ToggleGroup StrategieGroepWz;
    public Button btnLevensduurWz;
    public ListView lvLevensduurWz;

    public void initialize() throws SQLException {
        LadenPlant();
        LadenCommensalisme();
        LadenFenotype();
        LadenMonthlyInvullenWz();
        LadenExtra();
        Ladenhabitus();
        LadenBloeiwijjze();
        LadenAbiotischeFactoren();
        dbConnection = Database.getInstance().getConnection();

        //infotabel object aanmaken
        InfoTablesDAO infotablesDAO = new InfoTablesDAO(dbConnection);
        infoTables = infotablesDAO.getInfoTables();
        //comboboxes vullen
        FillComboboxes(infoTables);
        Pollenwaarde();
    }
    public void LadenCommensalisme(){
        //sociabiliteit
        for(int i = 0; i<ControllerPlantToevoegen.commMulti_eigenschapss.size(); i++){
            if(ControllerPlantToevoegen.commMulti_eigenschapss.get(i).getNaam().matches("sociabiliteit")){
                switch(ControllerPlantToevoegen.commMulti_eigenschapss.get(i).getValue()){
                    case "1": chkSociabiliteit1Wz.setSelected(true); break;
                    case "2": chkSociabiliteit2Wz.setSelected(true); break;
                    case "3": chkSociabiliteit3Wz.setSelected(true); break;
                    case "4": chkSociabiliteit4Wz.setSelected(true); break;
                    case "5": chkSociabiliteit5Wz.setSelected(true); break;
                }
            }
        }
        Commensalisme hulpc = ControllerPlantToevoegen.commensalismes.get(0);
        //strategie
        switch(hulpc.getStrategie()){
            case "": StrategieGroepWz.selectToggle(rbStrategieUnknownWz); break;
            case "C": StrategieGroepWz.selectToggle(rbStrategieTopWz); break;
            case "C-S-R": StrategieGroepWz.selectToggle(rbStrategieMMWz); break;
            case "C-R": StrategieGroepWz.selectToggle(rbStrategieLMWz); break;
            case "C-S": StrategieGroepWz.selectToggle(rbStrategieRMWz); break;
            case "R": StrategieGroepWz.selectToggle(rbStrategieLOWz); break;
            case "S-R": StrategieGroepWz.selectToggle(rbStrategieMOWz); break;
            case "S": StrategieGroepWz.selectToggle(rbStrategieROWz); break;
        }
        //ontwikkelingssnelheid
        //voegt keuzes in
        //cbOntwikkelingssnelheidWz.getItems().addAll(infoTables.getOnstwikkelingssnelheden()); blijkbaar hoeft dit niet aangezien
        cbOntwikkelingssnelheidWz.getSelectionModel().select(hulpc.getOntwikkelingssnelheid());

        //Listview opvullen
        for(int i = 0; i < ControllerPlantToevoegen.commMulti_eigenschapss.size();i++)
        {
            if(commMulti_eigenschapss.get(i).getNaam() == "levensduur")
            {
                lvLevensduurWz.getItems().add(i,ControllerPlantToevoegen.commMulti_eigenschapss.get(i).getValue());
            }
        }
    }
    //toevoegen items in levensduur/concurrentiekracht listview
    public void click_toevoegenLevensduurWz(MouseEvent mouseEvent) {
        if (!lvLevensduurWz.getItems().contains(cbLevensduurWz.getValue())) {
            lvLevensduurWz.getItems().add((String) cbLevensduurWz.getValue());
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Je kan niet 2 keer hetzelfde item toevoegen");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    System.out.println("Pressed OK.");
                }
            });
        }
    }
    //verwijderen items in levensduur/concurrentiekracht listview
    public void click_verwijderenLevensduurWz(MouseEvent mouseEvent) {
        final int selectedIndex = lvLevensduurWz.getSelectionModel().getSelectedIndex();
        lvLevensduurWz.getItems().remove(selectedIndex);
    }
    public void Pollenwaarde()    {
        slNectarwaardeWz.setMax(5);
        slPollenwaardeWz.setMax(5);
        //Change value
        PollenValueTv.textProperty().bind(
                Bindings.format(
                        "%.0f",
                        slPollenwaardeWz.valueProperty()
                )
        );
        NectarwaardeValueTv.textProperty().bind(
                Bindings.format(
                        "%.0f",
                        slNectarwaardeWz.valueProperty()
                )
        );
    }
    public void Selecteerjuisteradiobutton(RadioButton buttonja , RadioButton buttonnee , RadioButton buttonnull, String waarde)    {
        if(waarde =="ja")
        {
            buttonja.setSelected(true);
        }
        if(waarde == "nee")
        {
            buttonnee.setSelected(true);
        }
        if(waarde == "null")
        {
            buttonnull.setSelected(true);
        }
    }
    public void FillComboboxes(InfoTables infotables) {
        //type
        System.out.println(infotables.getPlantTypes().toString());
        cboTypeWz.getItems().addAll(infotables.getPlantTypes());

        //Bezonning
        cbBezonningWz.getItems().addAll(infotables.getBezonningsMogelijkheden());

        //Voedingsbehoefte
        cbVoedingsbehoefteWz.getItems().addAll(infotables.getVoedingsbehoeftes());

        //Vochtbehoefte
        cbVochtbehoefteWz.getItems().addAll(infotables.getVochtbehoeftes());

        //bladgrootte
        cbBladgrootteTotWz.getItems().addAll(infotables.getBladgroottes());
        //bladvorm
        cbBladvormWz.getItems().addAll(infotables.getBladvormen());
        //Grondsoort
        cbGrondsoortWz.getItems().addAll(infotables.getGrondsoorten());

        //BehandelingMaand
        //cboMaand.getItems().addAll("Januari", "februari", "maart", "april", "mei", "juni", "juli","augustus","september", "oktober", "november", "december");
        //ratio
        cbRatioWz.getItems().addAll(infotables.getBloeiBladRatios());
        //spruitfenologie
        cbSpruitfenologieWz.getItems().addAll(infotables.getSpruitfenologieen());
        //reactie antagonistische omgeving
        cbReactieAntaWz.getItems().addAll(infotables.getAntagonistischeOmgevingsReacties());
        //behandeling

        //Kleuren
        //Jan
        cbBladkleurJanWz.getItems().addAll(infotables.getKleuren());
        cbBloeikleurJanWz.getItems().addAll(infotables.getKleuren());
        //Feb
        cbBladkleurFebWz.getItems().addAll(infotables.getKleuren());
        cbBloeikleurFebWz.getItems().addAll(infotables.getKleuren());
        //Maart
        cbBladkleurMaaWz.getItems().addAll(infotables.getKleuren());
        cbBloeikleurMaaWz.getItems().addAll(infotables.getKleuren());
        //April
        cbBladkleurAprWz.getItems().addAll(infotables.getKleuren());
        cbBloeikleurAprWz.getItems().addAll(infotables.getKleuren());
        //Mei
        cbBladkleurMeiWz.getItems().addAll(infotables.getKleuren());
        cbBloeikleurMeiWz.getItems().addAll(infotables.getKleuren());
        //Juni
        cbBladkleurJunWz.getItems().addAll(infotables.getKleuren());
        cbBloeikleurJunWz.getItems().addAll(infotables.getKleuren());
        //Juli
        cbBladkleurJulWz.getItems().addAll(infotables.getKleuren());
        cbBloeikleurJulWz.getItems().addAll(infotables.getKleuren());
        //Augustus
        cbBladkleurAugWz.getItems().addAll(infotables.getKleuren());
        cbBloeikleurAugWz.getItems().addAll(infotables.getKleuren());
        //September
        cbBladkleurSeptWz.getItems().addAll(infotables.getKleuren());
        cbBloeikleurSeptWz.getItems().addAll(infotables.getKleuren());
        //Oktober
        cbBladkleurOktWz.getItems().addAll(infotables.getKleuren());
        cbBloeikleurOktWz.getItems().addAll(infotables.getKleuren());
        //November
        cbBladkleurNovWz.getItems().addAll(infotables.getKleuren());
        cbBloeikleurNovWz.getItems().addAll(infotables.getKleuren());
        //November
        cbBladkleurDecWz.getItems().addAll(infotables.getKleuren());
        cbBloeikleurDecWz.getItems().addAll(infotables.getKleuren());

        //Habitat
        cbHabitatWz.getItems().addAll(infotables.getHabitats());

        //Ontwikkelingssnelheid
        cbOntwikkelingssnelheidWz.getItems().addAll(infotables.getOnstwikkelingssnelheden());

        //Levensduur
        cbLevensduurWz.getItems().addAll(infotables.getConcurentiekrachten());
    }
        public void Clicked_PlantToevoegen(MouseEvent mouseEvent) throws Exception {
        createplant();//ik //done
        //createNaam();
        createAbiotischefactoren();//afgewerkt //done
        createAbiotischeMulti();//Mathias //done
        createfenotype();//afgewerkt // done*/
        createfenotypemulti();//Wout // done
        createCommensalisme();//Kasper //done
        createCommensalismeMulti();//Mathias //done
        //createBeheer();//Wout dit moet nog verplaatst worden naar een button op beheer scherm //done
        createExtra();//Kasper
        //createFoto(); nog geen plaats of scherm voor een foto in toe te voegen
        openNieuwScherm(mouseEvent);
    }
    public void openNieuwScherm(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("view/GedetailleerdeFiche.fxml"));
        Scene scen = new Scene(root);
        Stage window =(Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(scen);
        window.show();
        window.setMaximized(true);
    }
    public void createfenotype() throws Exception {
        //Aanmaken variabelen
        FenotypeDAO fenotypeDAO = new FenotypeDAO(dbConnection);
        int maxid = fenotypeDAO.getmaxid(), iBladgrootte;
        maxid++;
        String sBladvorm, sLevensvorm, sHabitus, sBloeiwijze, sRatio,sSpruitenologie ="", sTitel = "toevoegen fenotype";
        //Controle op bladvorm
        try{
            sBladvorm = cbBladvormWz.getValue();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij de bladvorm.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op levensvorm
        try{
            sLevensvorm = levensvormCheck();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij levensvorm. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op habitus
        try{
            sHabitus = habitusCheck();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij habitus. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op bloeiwijze
        try{
            sBloeiwijze = bloeiwijzeCheck();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij bloeiwijze. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op bladgrootte
        try{
            iBladgrootte = Integer.parseInt(cbBladgrootteTotWz.getValue());

        }catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij bladgrootte.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op ratio
        try{
            sRatio = cbRatioWz.getValue();

        }catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij ratio.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op spruitfenologie
        try{
            sSpruitenologie = cbSpruitfenologieWz.getValue();

        }catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij spruitfenologie.");
            System.out.println(ex);
            throw new Exception();
        }
        System.out.println(plantid);
        //Aanmaken fenotype + toevoegen aan array
        try{
            Fenotype fenotype = new Fenotype(maxid, plantid, sBladvorm, sLevensvorm, sHabitus, sBloeiwijze, iBladgrootte, sRatio, sSpruitenologie);
            System.out.println(fenotype.getBladgrootte()+" bladgroote bij jfenotye");
            fenotypess.add(fenotype);
        }
        catch (Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij het doorsturen van fenotype gegevens.");
            System.out.println(ex);
            throw new Exception();
        }

    }

    public void ShowError(String sTitel, String sMessage) {
        //tonen van error
        JOptionPane.showMessageDialog(null, sMessage, "Fout bij: " + sTitel, JOptionPane.INFORMATION_MESSAGE);

    }

    public String comboboxCheckString(SingleSelectionModel <String> combobox) {
        if(combobox.isEmpty()) {
            return "";
        }
        else {
            return combobox.getSelectedItem().toString();
        }
    }
    public Integer comboboxCheckInteger(SingleSelectionModel<String> combobox) {
        if(combobox.isEmpty()) {
            return 0;
        }
        else {
            return Integer.parseInt(combobox.getSelectedItem());
        }
    }
    public String habitusCheck(){
        if(rbTuftedWz.isSelected()){ return "tufted";}
        if(rbUprightarchingWz.isSelected()){ return "Upright arching";}
        if(rbArchingWz.isSelected()){ return "Arching";}
        if(rbUprightDivergentWz.isSelected()){ return "Upright Divergent";}
        if(rbUprightErectWz.isSelected()){ return "Upright erect";}
        if(rbMountedWz.isSelected()){ return "Mounted";}
        if(rbKOfHGOfMWz.isSelected()){ return "Kruipend of horizontaal groeiend of mattenvormend";}
        if(rbRondOfWaaiervormigWz.isSelected()){ return "Rond- of waaiervormig";}
        if(rbKussenvormendWz.isSelected()){ return "Kussenvormend";}
        if(rbZuilvormigWz.isSelected()){ return "Zuilvormig";}
        if(rbUitbuigendWz.isSelected()){ return "Uitbuigend";}
        if(rbWortelrozetplantWz.isSelected()){ return "(Wortel)rozetplant";}
        if(rbSucculentenWz.isSelected()){ return "Succulenten";}
        if(rbPollenvormersWz.isSelected()){ return "Pollenvormers";}
        if(rbParasolvormigWz.isSelected()){ return "Parasolvormig";}
        return "";
    }
    public String levensvormCheck(){
        if(rbHydro1Wz.isSelected()){return "1. Hydrofyt";}
        if(rbHydro2Wz.isSelected()){return "2. Hydrofyt";}
        if(rbHeloWz.isSelected()){return "3. Helofyt";}
        if(rbCrypto1Wz.isSelected()){return "4. Cryptophyt";}
        if(rbCrypto2Wz.isSelected()){return "5. Cryptophyt";}
        if(rbHemikryptoWz.isSelected()){return "6. Hemikryptofyt";}
        if(rbChamae1Wz.isSelected()){return "7. Chamaefyt";}
        if(rbChamae2Wz.isSelected()){return "8. Chamaefyt";}
        if(rbFaneroWz.isSelected()){return "9. Fanerophyt";}
        return "";
    }
    public String bloeiwijzeCheck(){
        if(rbAarWz.isSelected()){return "Aar";}
        if(rbBredePluimWz.isSelected()){return "Brede pluim";}
        if(rbEtageWz.isSelected()){return "Etage";}
        if(rbBolOfKnopWz.isSelected()){return "Bol of knop";}
        if(rbMargrietachtigWz.isSelected()){return "Margrietachtig";}
        if(rbSchotelWz.isSelected()){return "Schotel";}
        if(rbSchermWz.isSelected()){return "Scherm";}
        if(rbSmallePluimWz.isSelected()){return "Smalle pluim";}
        return "";
    }
    public void createplant() throws SQLException {
        //Aanmaken variabelen
        //volledig toevoegen in databank vanuit scherm, waarschijnlijk nog iets toevoegen voor te kijken of de naam al in de databank zit
        GebruikerDAO gebruikerDAO = new GebruikerDAO(dbConnection);
        PlantDAO plantDAO = new PlantDAO(dbConnection);
        NaamDao naamDAO = new NaamDao(dbConnection);
        Plant plantTest = new Plant(cboTypeWz.getValue().toString(),txtFamilieWz.getText(),txtGeslachtWz.getText(),txtSoortWz.getText(),txtVariantWz.getText());
        int maxidplant = plantDAO.getmaxid();
        String sEmailadres = "kurt.engelbrecht@vives.be";
        String srolGebruiker = gebruikerDAO.getRolMetEmail(sEmailadres);
        String sFamilie = txtFamilieWz.getText();
        String sGeslacht = txtGeslachtWz.getText();
        String sSoort = txtSoortWz.getText();
        String sVariant = txtVariantWz.getText();
        String sFgsv = sFamilie + " " + sGeslacht+ " " + sSoort+" " + sVariant;
        String sPlanttype = cboTypeWz.getValue().toString();
        int iStatus = 0;
        int x = 0;
        int y = 0;
        if(txtDichtheidXWz.getText().matches("[0-9]+")){
            x = Integer.parseInt(txtDichtheidXWz.getText());
        }
        if(txtDichtheidYWz.getText().matches("[0-9]+")){
            y = Integer.parseInt(txtDichtheidYWz.getText());
        }

        //Controle of plantnaam al bestaat
        int iDubbeleNaam = naamDAO.ControleDubbeleNaam(plantTest);
        //als plant nog niet bestaat, plant toevoegen
        if (iDubbeleNaam == 0) {
            //Toevoegen plant docent/admin
            if (srolGebruiker.equals("admin") || srolGebruiker.equals("docent"))
            {
                iStatus = 2;
                System.out.println(plantss.get(0).getGebruikersID() + " " + plantss.get(0).getLaatste_update_door());
                Plant plant = new Plant(plantid, sPlanttype, sFamilie, sGeslacht, sSoort, sVariant, x, y, sFgsv,iStatus, plantss.get(0).getLaatste_update_door());
                plantss.clear();
                plantss.add(plant);
            }
            //Toevoegen plant als leerling/gast punt voor Wout
            else
            {
                iStatus = 1;
                System.out.println(plantss.get(0).getGebruikersID() + " " + plantss.get(0).getLaatste_update_door());
                Plant plant = new Plant(plantid, sPlanttype, sFamilie, sGeslacht, sSoort, sVariant, x, y, sFgsv,iStatus,plantss.get(0).getLaatste_update_door());
                plantss.clear();
                plantss.add(plant);
            }
        }
        //Als plant bestaat waarschuwing geven
        else
        {
            DubbelePlantWaarschuwing();
        }


    }
    private void DubbelePlantWaarschuwing() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Error");
        alert.setContentText("Deze plant bestaat al.");
        alert.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {
                System.out.println("Pressed OK.");
            }
        });
    }
    public void createAbiotischefactoren() throws Exception {
        //alles van scherm direct naar databank aangezien hier de input enkel kan gekozen worden uit gegeven lijsten
        //deze functie is afgewerkt
        //Aanmaken variabelen
        String sBezonning = "", sGrondsoort = "", sVochtbehoefte = "", sVoedingsbehoefte = "", sReactieAntagonische = "", sTitel = "Abiotische factoren";
        AbiotischeFactorenDAO abiotischeFactorenDAO = new AbiotischeFactorenDAO(dbConnection);
        int maxidabio = abiotischeFactorenDAO.getmaxid();
        //Controle op bezonning
        try {
            sBezonning = cbBezonningWz.getValue();
        } catch (Exception ex) {
            ShowError(sTitel, "Er is een fout opgelopen bij bezonning. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op grondsoort
        try {
            sGrondsoort = cbGrondsoortWz.getValue();
        } catch (Exception ex) {
            ShowError(sTitel, "Er is een fout opgelopen bij grondsoort. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op vochtbehoefte
        try{
            sVochtbehoefte = cbVochtbehoefteWz.getValue();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij vochtbehoefte. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op voedingsbehoefte
        try{
            sVoedingsbehoefte = cbVoedingsbehoefteWz.getValue();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij voedingsbehoefte. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op reactie antagonistische omgeving
        try{
            sReactieAntagonische = cbReactieAntaWz.getValue();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij reactie antagonistische omgeving. ");
            System.out.println(ex);
            throw new Exception();
        }
        //aanmaken abiotische factoren, en doorgeven naar array
        try {
            AbiotischeFactoren abiotischeFactoren = new AbiotischeFactoren(maxidabio + 1, plantid, sBezonning, sGrondsoort, sVochtbehoefte, sVoedingsbehoefte, sReactieAntagonische);
            abiotischeFactorenn.add(abiotischeFactoren);
        } catch (Exception ex) {
            ShowError(sTitel, "Er is een fout gebeurd bij aanmaken abiotische factoren.");
            System.out.println(ex);
            throw new Exception();
        }

    }

    public void createCommensalisme() throws Exception {
        //Aanmaken variabelen
        CommensalismeDAO commensalismeDAO = new CommensalismeDAO(dbConnection);
        int maxidcommensalisme = commensalismeDAO.getmaxid();
        String sStrategie, sOntwikkelingssnelheid, sTitel = " toevoegen commensalisme";

        //Controle op strategie
        try{
            sStrategie = strategieCheck();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout gebeurd bij strategie.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op Ontwikkeling
        try{
            sOntwikkelingssnelheid = cbOntwikkelingssnelheidWz.getValue();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout gebeurd bij strategie.");
            System.out.println(ex);
            throw new Exception();
        }

        Commensalisme commensalisme = new Commensalisme(maxidcommensalisme + 1, plantid, sStrategie, sOntwikkelingssnelheid);
        commensalismes.add(commensalisme);
    }
    public String strategieCheck() {
        if(rbStrategieTopWz.isSelected()) {
            return "C";
        }
        else if (rbStrategieMMWz.isSelected()) {
            return "C-S-R";
        }
        else if (rbStrategieLMWz.isSelected()) {
            return "C-R";
        }
        else if (rbStrategieRMWz.isSelected()) {
            return "C-S";
        }
        else if (rbStrategieLOWz.isSelected()) {
            return "R";
        }
        else if (rbStrategieMOWz.isSelected()) {
            return "S-R";
        }
        else if (rbStrategieROWz.isSelected()) {
            return "S";
        }
        else {
            return "";
        }
    }
    //Toevoegen van extra eigenschappen aan de array.
    public void createExtra() throws Exception {
        //Aanmaken variabelen
        int iNectarwaarde, iPollenwaarde;
        String sBijVriendelijk,sEetbaar,sKruidgebruik,sGeurend,sVorstgevoeling, sTitel = "toevoegen extra eigenschappen.";

        ExtraDAO extraDAO = new ExtraDAO(dbConnection);
        int maxidextra = extraDAO.getmaxid();
        maxidextra++;

        //Foutafhandeling
        //Controle op nectarwaarde
        try{
            iNectarwaarde = Integer.parseInt(NectarwaardeValueTv.getText());
        }
        catch (Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij nectarwaarde.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op pollenwaarde
        try{
            iPollenwaarde = Integer.parseInt(PollenValueTv.getText());
        }
        catch (Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij pollenwaarde.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op bijvriendelijk
        try{
            sBijVriendelijk = bijvriendelijkCheck();

        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij bijvriendelijk.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op eetbaar
        try{
            sEetbaar= eetbaarCheck();

        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij eetbaar.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op kruidgebruik
        try{
            sKruidgebruik = kruidgebruikCheck();

        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij kruidgebruik.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op geurend
        try{
            sGeurend = geurendCheck();

        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij geurend.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op vorstgevoelig
        try{
            sVorstgevoeling = vorstgevoeligCheck();

        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij vorstgevoelig.");
            System.out.println(ex);
            throw new Exception();
        }
        Extra extra = new Extra(maxidextra, plantid, iNectarwaarde, iPollenwaarde, sBijVriendelijk, sEetbaar, sKruidgebruik, sGeurend, sVorstgevoeling, vlindervriendelijkCheck());
        //deze fout van createExtra komt uit extraDAO omdat het niet zeker is hoe eetbaar en kruidgebruik uit de databank gehaald moeten worden
        extrass.clear();
        extrass.add(extra);
        //ExtraDAO.createExtra(extra);
    }

    public String vorstgevoeligCheck() {
        if(rbVorstgevoeligJaWz.isSelected()) {
            return "ja";
        }
        else if (rbVorstgevoeligNeeWz.isSelected()) {
            return "nee";
        }
        else {
            return "";
        }
    }

    public String vlindervriendelijkCheck() {
        if(rbVlindervriendelijkJaWz.isSelected()) {
            return "ja";
        }
        else if (rbVlindervriendelijkNeeWz.isSelected()) {
            return "nee";
        }
        else {
            return "";
        }
    }

    public String eetbaarCheck() {
        if(rbEetbaarJaWz.isSelected()) {
            return "ja";
        }
        else if (rbEetbaarNeeWz.isSelected()) {
            return "nee";
        }
        else {
            return "";
        }
    }
    public String geurendCheck() {
        if(rbGeurendJaWz.isSelected()) {
            return "ja";
        }
        else if (rbGeurendNeeWz.isSelected()) {
            return "nee";
        }
        else {
            return "";
        }
    }
    public String kruidgebruikCheck() {
        if(rbKruidgebruikJaWz.isSelected()) {
            return "ja";
        }
        else if (rbKruidgebruikNeeWz.isSelected()) {
            return "nee";
        }
        else {
            return "";
        }
    }
    public String bijvriendelijkCheck() {
        if(rbBijvriendelijkJaWz.isSelected()) {
            return "ja";
        }
        else if (rbBijvriendelijkNeeWz.isSelected()) {
            return "nee";
        }
        else {
            return "";
        }
    }
    public void createCommensalismeMulti() throws SQLException {
        //aantal elementen in bovenstaande lijst bijhouden
        int aantalCommMulti = 0;
        commMulti_eigenschapss.clear();
        for (int i = 0; i < lvLevensduurWz.getItems().size(); i++) {
            CommMulti_Eigenschap commensalisme = new CommMulti_Eigenschap("levensduur", lvLevensduurWz.getItems().get(i).toString(),plantid);
            commMulti_eigenschapss.add(commensalisme);
            aantalCommMulti++;
        }


        //Toevoegen van sociabiliteit
        if (chkSociabiliteit1Wz.isSelected()) {
            CommMulti_Eigenschap sociabiliteit = new CommMulti_Eigenschap("sociabiliteit", "1",plantid);
            System.out.println(sociabiliteit.getNaam());
            commMulti_eigenschapss.add(sociabiliteit);
            aantalCommMulti++;
        }
        if (chkSociabiliteit2Wz.isSelected()) {
            CommMulti_Eigenschap sociabiliteit = new CommMulti_Eigenschap("sociabiliteit", "2",plantid);
            System.out.println(sociabiliteit.getNaam());
            commMulti_eigenschapss.add(sociabiliteit);
            aantalCommMulti++;
        }
        if (chkSociabiliteit3Wz.isSelected()) {
            CommMulti_Eigenschap sociabiliteit = new CommMulti_Eigenschap("sociabiliteit", "3",plantid);
            System.out.println(sociabiliteit.getNaam());
            commMulti_eigenschapss.add(sociabiliteit);
            aantalCommMulti++;
        }
        if (chkSociabiliteit4Wz.isSelected()) {
            CommMulti_Eigenschap sociabiliteit = new CommMulti_Eigenschap("sociabiliteit", "4",plantid);
            System.out.println(sociabiliteit.getNaam());
            commMulti_eigenschapss.add(sociabiliteit);
            aantalCommMulti++;
        }
        if (chkSociabiliteit5Wz.isSelected()) {
            CommMulti_Eigenschap sociabiliteit = new CommMulti_Eigenschap("sociabiliteit", "5",plantid);
            System.out.println(sociabiliteit.getNaam());
            commMulti_eigenschapss.add(sociabiliteit);
            aantalCommMulti++;
        }
        AantalPerElCommMulti.add(aantalCommMulti);
    }
    public void createFoto() throws SQLException{
        FotoDAO fotoDAO = new FotoDAO(dbConnection);
        int maxIdFoto = fotoDAO.getmaxid();
        Foto foto = new Foto(maxIdFoto + 1, plantid, "a", "b", null);
        fotoDAO.createFoto(foto);
    }
    public void createfenotypemulti() throws SQLException {
        FenotypeDAO fenotypeDAO = new FenotypeDAO(dbConnection);
        int maxid = fenotypeDAO.getmaxidmulti();
        maxid++;
        System.out.println(maxid);
        String naam ="bladhoogte";
        System.out.println();
        ArrayList<FenoMulti_Eigenschap> fenoMulti_eigenschaps = new ArrayList<>();
        fenoMulti_eigenschapss.size();
        FenoMulti_Eigenschap bladhoogte = new FenoMulti_Eigenschap(maxid,"Bladhoogte", spinMaxBladhJanWz.getValue().toString(),spinMaxBladhFebWz.getValue().toString(),spinMaxBladhMaaWz.getValue().toString(),spinMaxBladhAprWz.getValue().toString(),spinMaxBladhMeiWz.getValue().toString(),spinMaxBladhJunWz.getValue().toString(),spinMaxBladhJulWz.getValue().toString(),spinMaxBladhAugWz.getValue().toString(),spinMaxBladhSeptWz.getValue().toString(),spinMaxBladhOktWz.getValue().toString(),spinMaxBladhNovWz.getValue().toString(),spinMaxBladhDecWz.getValue().toString());
        maxid++;
        FenoMulti_Eigenschap bladkleur = new FenoMulti_Eigenschap(maxid,"Bladkleur",comboboxCheckString(cbBladkleurJanWz.getSelectionModel()),comboboxCheckString(cbBladkleurFebWz.getSelectionModel()),comboboxCheckString(cbBladkleurMaaWz.getSelectionModel()),comboboxCheckString(cbBladkleurAprWz.getSelectionModel()), comboboxCheckString(cbBladkleurMeiWz.getSelectionModel()), comboboxCheckString(cbBladkleurJunWz.getSelectionModel()),comboboxCheckString(cbBladkleurJulWz.getSelectionModel()),comboboxCheckString(cbBladkleurAugWz.getSelectionModel()),comboboxCheckString(cbBladkleurSeptWz.getSelectionModel()),comboboxCheckString(cbBladkleurOktWz.getSelectionModel()),comboboxCheckString(cbBladkleurNovWz.getSelectionModel()),comboboxCheckString(cbBladkleurDecWz.getSelectionModel()));
        maxid++;
        FenoMulti_Eigenschap minbloeihoogte = new FenoMulti_Eigenschap(maxid,"Min Bloeihoogte",spinMinBloeihJanWz.getValue().toString() , spinMinBloeihFebWz.getValue().toString(),spinMinBloeihMaaWz.getValue().toString(),spinMinBloeihAprWz.getValue().toString(),spinMinBloeihMeiWz.getValue().toString(),spinMinBloeihJunWz.getValue().toString(),spinMinBloeihJulWz.getValue().toString(),spinMinBloeihAugWz.getValue().toString(),spinMaxBloeihSeptWz.getValue().toString(),spinMinBloeihOktWz.getValue().toString(),spinMinBloeihNovWz.getValue().toString(),spinMinBloeihDecWz.getValue().toString());
        maxid++;
        FenoMulti_Eigenschap maxbloeihoogte = new FenoMulti_Eigenschap(maxid,"Max Bloeihoogte",spinMaxBloeihJanWz.getValue().toString(),spinMaxBloeihFebWz.getValue().toString(),spinMaxBladhMaaWz.getValue().toString(),spinMaxBloeihAprWz.getValue().toString(),spinMaxBloeihMeiWz.getValue().toString(),spinMaxBloeihJunWz.getValue().toString(),spinMaxBloeihJulWz.getValue().toString(),spinMaxBloeihAugWz.getValue().toString(),spinMaxBloeihSeptWz.getValue().toString(),spinMaxBloeihOktWz.getValue().toString(),spinMaxBloeihNovWz.getValue().toString(),spinMaxBloeihDecWz.getValue().toString());
        maxid++;
        FenoMulti_Eigenschap bloeikleur = new FenoMulti_Eigenschap(maxid,"Bloeikleur" ,comboboxCheckString(cbBloeikleurJanWz.getSelectionModel()),comboboxCheckString(cbBloeikleurFebWz.getSelectionModel()),comboboxCheckString(cbBloeikleurMaaWz.getSelectionModel()),comboboxCheckString(cbBloeikleurAprWz.getSelectionModel()),comboboxCheckString(cbBloeikleurMeiWz.getSelectionModel()),comboboxCheckString(cbBloeikleurJunWz.getSelectionModel()),comboboxCheckString(cbBloeikleurJulWz.getSelectionModel()),comboboxCheckString(cbBloeikleurAugWz.getSelectionModel()),comboboxCheckString(cbBloeikleurSeptWz.getSelectionModel()),comboboxCheckString(cbBloeikleurOktWz.getSelectionModel()),comboboxCheckString(cbBloeikleurNovWz.getSelectionModel()),comboboxCheckString(cbBloeikleurDecWz.getSelectionModel()));
        fenoMulti_eigenschaps.add(bladhoogte);
        fenoMulti_eigenschaps.add(bladkleur);
        fenoMulti_eigenschaps.add(minbloeihoogte);
        fenoMulti_eigenschaps.add(maxbloeihoogte);
        fenoMulti_eigenschaps.add(bloeikleur);
        fenoMulti_eigenschapss.clear();
        for (int i =0 ; i < 5;i++)
        {
            FenoMulti_Eigenschap fenoMulti_eigenschap = new FenoMulti_Eigenschap(fenoMulti_eigenschaps.get(i).getId(),fenoMulti_eigenschaps.get(i).getNaam(),fenoMulti_eigenschaps.get(i).getJan(), fenoMulti_eigenschaps.get(i).getFeb(),fenoMulti_eigenschaps.get(i).getMaa(),fenoMulti_eigenschaps.get(i).getApr(),fenoMulti_eigenschaps.get(i).getMei(),fenoMulti_eigenschaps.get(i).getJun(),fenoMulti_eigenschaps.get(i).getJul(),fenoMulti_eigenschaps.get(i).getAug(),fenoMulti_eigenschaps.get(i).getSep(),fenoMulti_eigenschaps.get(i).getOkt(),fenoMulti_eigenschaps.get(i).getNov(),fenoMulti_eigenschaps.get(i).getDec());
            fenoMulti_eigenschapss.add(fenoMulti_eigenschap);
        }
    }
    private void createAbiotischeMulti() throws SQLException {
        //aantal el toegevoegd in abmulti lijst bijhouden
        int aantalAbMultiEl = 0;
        AbiotischeFactorenDAO abiotischeMultidao = new AbiotischeFactorenDAO(dbConnection);
        System.out.println(" " + plantid);
        abiotischmulti.clear();
        for (int i = 0; i < lvHabitatWz.getItems().size(); i++) {

            AbioMulti_Eigenschap abiotisch = new AbioMulti_Eigenschap("Habitat", (String) lvHabitatWz.getItems().get(i));
            abiotischmulti.add(abiotisch);
            aantalAbMultiEl++;
        }
        AantalPerElAbMulti.add(aantalAbMultiEl);
    }
    public void createNaam() throws SQLException {
        NaamDao naamDAO = new NaamDao(dbConnection);

        Plant plant = new Plant(cboTypeWz.getValue().toString(),txtFamilieWz.getText(),txtGeslachtWz.getText(),txtSoortWz.getText(),txtVariantWz.getText());


        //Controle of plantnaam al bestaat
        int iDubbeleNaam = naamDAO.ControleDubbeleNaam(plant);
        if (iDubbeleNaam == 0)
        { naamDAO.createNaam(plant);}
        else{
            DubbelePlantWaarschuwing();
        }
    }
    public void LadenPlant() {
        //Omzetten integer naar string
        int dichtheidX = plantss.get(0).getMinPlantdichtheid();
        int dichtheidY = plantss.get(0).getMaxPlantdichtheid();
        //Values instellen
        cboTypeWz.getSelectionModel().select(plantss.get(0).getPlantType());;
        txtFamilieWz.setText(plantss.get(0).getFamilie());
        txtGeslachtWz.setText(plantss.get(0).getGeslacht());
        txtSoortWz.setText(plantss.get(0).getSoort());
        txtVariantWz.setText(plantss.get(0).getVariatie());
        txtDichtheidXWz.setText(String.valueOf(dichtheidX));
        txtDichtheidYWz.setText(String.valueOf(dichtheidY));
    }
    public void LadenFenotype() {
        //Comboboxes laden
        cbBladgrootteTotWz.getSelectionModel().select(String.valueOf(fenotypess.get(0).getBladgrootte()));
        cbBladvormWz.getSelectionModel().select(fenotypess.get(0).getBladvorm());
        cbRatioWz.getSelectionModel().select(fenotypess.get(0).getRatio_bloei_blad());
        cbSpruitfenologieWz.getSelectionModel().select(fenotypess.get(0).getSpruitfenologie());
        String waarde = fenotypess.get(0).getLevensvorm();
        //Radiobuttons laden
        if (waarde == "1. Hydrofyt") {
            rbHydro1Wz.setSelected(true);
        }
        else if (waarde == "2. Hydrofyt") {
            rbHydro2Wz.setSelected(true);
        }
        else if (waarde == "3. Helofyt") {
            rbHeloWz.setSelected(true);
        }
        else if (waarde == "4. Cryptophyt") {
            rbCrypto1Wz.setSelected(true);
        }
        else if (waarde == "5. Cryptophyt") {
            rbCrypto2Wz.setSelected(true);
        }
        else if (waarde == "6. Hemikryptofyt") {
            rbHemikryptoWz.setSelected(true);
        }
        else if (waarde == "7. Chamaefyt") {
            rbChamae1Wz.setSelected(true);
        }
        else if (waarde == "8. Chamaefyt") {
            rbChamae2Wz.setSelected(true);
        }
        else if (waarde == "9. Fanerophyt") {
            rbFaneroWz.setSelected(true);
        }
        else {
            System.out.println("Geen waarde voor levensvorm meegegeven");
        }
    }
    public void LadenExtra()    {
        slNectarwaardeWz.setValue( ControllerPlantToevoegen.extrass.get(0).getNectarwaarde());
        slPollenwaardeWz.setValue(ControllerPlantToevoegen.extrass.get(0).getPollenwaarde());
        Selecteerjuisteradiobutton(rbBijvriendelijkJaWz,rbBijvriendelijkNeeWz,rbBijvriendelijkNullWz, ControllerPlantToevoegen.extrass.get(0).getBijvriendelijk());
        Selecteerjuisteradiobutton(rbVlindervriendelijkJaWz,rbVlindervriendelijkNeeWz,rbVlindervriendelijkNullWz, ControllerPlantToevoegen.extrass.get(0).getVlindervriendelijk());
        Selecteerjuisteradiobutton(rbEetbaarJaWz,rbEetbaarNeeWz,rbEetbaarNullWz,ControllerPlantToevoegen.extrass.get(0).getEetbaar());
        Selecteerjuisteradiobutton(rbKruidgebruikJaWz,rbKruidgebruikNeeWz,rbKruidgebruikNullWz,ControllerPlantToevoegen.extrass.get(0).getKruidgebruik());
        Selecteerjuisteradiobutton(rbGeurendJaWz,rbGeurendNeeWz,rbGeurendNullWz,ControllerPlantToevoegen.extrass.get(0).getGeurend());
        Selecteerjuisteradiobutton(rbVorstgevoeligJaWz,rbVorstgevoeligNeeWz,rbVorstgevoeligNullWz,ControllerPlantToevoegen.extrass.get(0).getVorstgevoelig());
    }
    public void LadenMonthlyInvullenWz() throws SQLException{
        //mogelijke selectie van kleuren is toegevoegd

        //selectie van max bladhoogte
        for(int i=0;i<5;i++){
            if(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getNaam().matches("Bladhoogte")){
                spinMaxBladhJanWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJan()));
                spinMaxBladhFebWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getFeb()));
                spinMaxBladhMaaWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getMaa()));
                spinMaxBladhAprWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getApr()));
                spinMaxBladhMeiWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getMei()));
                spinMaxBladhJunWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJun()));
                spinMaxBladhJulWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJul()));
                spinMaxBladhAugWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getAug()));
                spinMaxBladhSeptWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getSep()));
                spinMaxBladhOktWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getOkt()));
                spinMaxBladhNovWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getNov()));
                spinMaxBladhDecWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getDec()));
            }
        }

        //selectie van max bloeihoogte
        for(int i=0;i<5;i++){
            if(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getNaam().matches("Max Bloeihoogte")){
                spinMaxBloeihJanWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJan()));
                spinMaxBloeihFebWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getFeb()));
                spinMaxBloeihMaaWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getMaa()));
                spinMaxBloeihAprWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getApr()));
                spinMaxBloeihMeiWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getMei()));
                spinMaxBloeihJunWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJun()));
                spinMaxBloeihJulWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJul()));
                spinMaxBloeihAugWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getAug()));
                spinMaxBloeihSeptWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getSep()));
                spinMaxBloeihOktWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getOkt()));
                spinMaxBloeihNovWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getNov()));
                spinMaxBloeihDecWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getDec()));
            }
        }

        //selectie van min bloeihoogte
        for(int i=0;i<5;i++){
            if(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getNaam().matches("Min Bloeihoogte")){
                spinMinBloeihJanWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJan()));
                spinMinBloeihFebWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getFeb()));
                spinMinBloeihMaaWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getMaa()));
                spinMinBloeihAprWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getApr()));
                spinMinBloeihMeiWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getMei()));
                spinMinBloeihJunWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJun()));
                spinMinBloeihJulWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJul()));
                spinMinBloeihAugWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getAug()));
                spinMinBloeihSeptWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getSep()));
                spinMinBloeihOktWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getOkt()));
                spinMinBloeihNovWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getNov()));
                spinMinBloeihDecWz.getValueFactory().setValue(Integer.parseInt(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getDec()));
            }
        }

        //selectie van bloeikleur en bladkleur insteken
        //selectie insteken van bladkleur, overlopen van lijst voor eigenschap met bladkleur te vinden, dan de waarden daarvan in deze comboboxen steken
        for(int i=0;i<5;i++){
            if(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getNaam().matches("Bladkleur")){
                cbBladkleurJanWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJan());
                cbBladkleurFebWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getFeb());
                cbBladkleurMaaWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getMaa());
                cbBladkleurAprWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getApr());
                cbBladkleurMeiWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getMei());
                cbBladkleurJunWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJun());
                cbBladkleurJulWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJul());
                cbBladkleurAugWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getAug());
                cbBladkleurSeptWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getSep());
                cbBladkleurOktWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getOkt());
                cbBladkleurNovWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getNov());
                cbBladkleurDecWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getDec());
            }
        }

        //selectie insteken van bladkleur, overlopen van lijst voor eigenschap met bloeikleur te vinden, dan de waarden daarvan in deze comboboxen steken
        for(int i=0;i<5;i++){
            if(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getNaam().matches("Bloeikleur")){
                cbBloeikleurJanWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJan());
                cbBloeikleurFebWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getFeb());
                cbBloeikleurMaaWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getMaa());
                cbBloeikleurAprWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getApr());
                cbBloeikleurMeiWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getMei());
                cbBloeikleurJunWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJun());
                cbBloeikleurJulWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getJul());
                cbBloeikleurAugWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getAug());
                cbBloeikleurSeptWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getSep());
                cbBloeikleurOktWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getOkt());
                cbBloeikleurNovWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getNov());
                cbBloeikleurDecWz.getSelectionModel().select(ControllerPlantToevoegen.fenoMulti_eigenschapss.get(i).getDec());
            }
        }
    }
    public void Ladenhabitus() {
        if(fenotypess.get(0).getHabitus() == "tufted")
        {
            rbTuftedWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "Upright arching")
        {
            rbUprightarchingWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "Arching")
        {
            rbArchingWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "Upright Divergent")
        {
            rbUprightDivergentWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "Upright erect")
        {
            rbUprightErectWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "Mounted")
        {
            rbMountedWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "Kruipend of horizontaal groeiend of mattenvormend")
        {
            rbKOfHGOfMWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "Rond- of waaiervormig")
        {
            rbRondOfWaaiervormigWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "Kussenvormend")
        {
            rbKussenvormendWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "Zuilvormig")
        {
            rbZuilvormigWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "Uitbuigend")
        {
            rbUitbuigendWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "(Wortel)rozetplant")
        {
            rbWortelrozetplantWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "Succulenten")
        {
            rbSucculentenWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "Pollenvormers")
        {
            rbPollenvormersWz.setSelected(true);
        }
        if(fenotypess.get(0).getHabitus() == "Parasolvormig")
        {
            rbParasolvormigWz.setSelected(true);
        }
    }
    public void LadenBloeiwijjze()  {
        if(fenotypess.get(0).getBloeiwijze() == "Aar")
        {
            rbAarWz.setSelected(true);
        }
        if(fenotypess.get(0).getBloeiwijze() == "Brede pluim")
        {
            rbBredePluimWz.setSelected(true);
        }
        if(fenotypess.get(0).getBloeiwijze() == "Etage")
        {
            rbEtageWz.setSelected(true);
        }
        if(fenotypess.get(0).getBloeiwijze() == "Bol of knop")
        {
            rbBolOfKnopWz.setSelected(true);
        }
        if(fenotypess.get(0).getBloeiwijze() == "Margrietachtig")
        {
            rbMargrietachtigWz.setSelected(true);
        }
        if(fenotypess.get(0).getBloeiwijze() == "Schotel")
        {
            rbSchotelWz.setSelected(true);
        }
        if(fenotypess.get(0).getBloeiwijze() == "Scherm")
        {
            rbSchermWz.setSelected(true);
        }
        if(fenotypess.get(0).getBloeiwijze() == "Smalle pluim")
        {
            rbSmallePluimWz.setSelected(true);
        }
    }
    public void LadenAbiotischeFactoren() {
        //Comboboxen opvullen
        cbBezonningWz.getSelectionModel().select(ControllerPlantToevoegen.abiotischeFactorenn.get(0).getBezonning());
        cbVoedingsbehoefteWz.getSelectionModel().select(ControllerPlantToevoegen.abiotischeFactorenn.get(0).getVoedingsbehoefte());
        cbVochtbehoefteWz.getSelectionModel().select(ControllerPlantToevoegen.abiotischeFactorenn.get(0).getVochtbehoefte());
        cbReactieAntaWz.getSelectionModel().select(ControllerPlantToevoegen.abiotischeFactorenn.get(0).getReactieAntagonistischeOmgeving());
        cbGrondsoortWz.getSelectionModel().select(ControllerPlantToevoegen.abiotischeFactorenn.get(0).getGrondsoort());

        //Listview opvullen
        for(int i = 0; i < ControllerPlantToevoegen.abiotischmulti.size();i++)
        {
            if(abiotischmulti.get(i).getNaam()=="Habitat")
            {
                lvHabitatWz.getItems().add(i,ControllerPlantToevoegen.abiotischmulti.get(i).getValue());
            }
        }
    }
    public void click_toevoegenHabitat(MouseEvent mouseEvent) {
        if (!lvHabitatWz.getItems().contains(cbHabitatWz.getValue())) {
            lvHabitatWz.getItems().add((String) cbHabitatWz.getValue());
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Je kan niet 2 keer hetzelfde item toevoegen");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    System.out.println("Pressed OK.");
                }
            });
        }
    }
    public void click_verwijderenHabitat(MouseEvent mouseEvent) {
        final int selectedIndex = lvHabitatWz.getSelectionModel().getSelectedIndex();
        lvHabitatWz.getItems().remove(selectedIndex);
    }
}
