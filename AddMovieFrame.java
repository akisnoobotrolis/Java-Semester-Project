import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JComboBox;
import java.util.regex.Pattern;

public class AddMovieFrame extends JFrame implements ActionListener {

    private MovieWriter movieWriter;
    private Movie movie;
    private Container container = getContentPane();
    private JLabel titleLabel = new JLabel("Title",SwingConstants.CENTER);
    private JTextField titleTextField = new JTextField();
    private JLabel yearLabel = new JLabel("Year",SwingConstants.CENTER);
    private JComboBox yearBox = new JComboBox();
    private JTextField durationTextField = new JTextField();
    private JLabel durationLabel = new JLabel("Minutes",SwingConstants.CENTER);
    private JComboBox categoryBox = new JComboBox();
    private JLabel categoryLabel = new JLabel("Category",SwingConstants.CENTER);
    private JLabel directorLabel = new JLabel("Director",SwingConstants.CENTER);
    private JLabel companyLabel = new JLabel("Company",SwingConstants.CENTER);
    private JTextField directorTextField = new JTextField();
    private JTextField companyTextField = new JTextField();
    private JLabel ratingLabel = new JLabel("Rating",SwingConstants.CENTER);
    private JComboBox ratingBox = new JComboBox();
    private JButton statisticsButton = new JButton("Statistics");
    private JButton aboutButton = new JButton("About");
    private JButton saveButton = new JButton("Save");



    AddMovieFrame() {




        for (int i = 0; i < 101; i++) {
            ratingBox.addItem(i);
        }
        for (int i = 1888; i < 2023; i++) {
            yearBox.addItem(i);
        }
        categoryBox.addItem("Action");
        categoryBox.addItem("Comedy");
        categoryBox.addItem("Drama");
        categoryBox.addItem("Fantasy");
        categoryBox.addItem("Horror");
        categoryBox.addItem("Mystery");
        categoryBox.addItem("Romance");
        categoryBox.addItem("Thriller");
        categoryBox.addItem("Western");
        setLayoutManager();
        setLocationAndSize();

        addComponentsToContainer();
        container.setBackground(Color.GRAY);
        addActionEvent();
        this.setVisible(true);
        this.setBounds(10, 10, 500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }







    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {



        titleTextField.setBounds(300, 30, 100, 30);
        titleLabel.setBounds(100, 30, 100, 30);
        yearLabel.setBounds(100, 90, 100, 30);
        yearBox.setBounds(300,90,100,30);
        durationLabel.setBounds(100, 150, 100, 30);
        durationTextField.setBounds(300, 150, 100, 30);

        directorLabel.setBounds(100, 210, 100, 30);
        directorTextField.setBounds(300, 210, 100, 30);
        companyLabel.setBounds(100, 270, 100, 30);
        companyTextField.setBounds(300, 270, 100, 30);
        categoryLabel.setBounds(100,330,100,30);
        categoryBox.setBounds(300,330,100,30);
        ratingLabel.setBounds(100, 390, 100, 30);
        ratingBox.setBounds(300, 390, 100, 30);
        aboutButton.setBounds(50, 500, 100, 30);
        statisticsButton.setBounds(200, 500, 100, 30);
        saveButton.setBounds(350,500,100,30);


    }

    public void addComponentsToContainer() {
        container.add(titleLabel);
        container.add(titleTextField);
        container.add(yearLabel);
        container.add(yearBox);
        container.add(directorLabel);
        container.add(directorTextField);
        container.add(durationLabel);
        container.add(durationTextField);
        container.add(companyTextField);
        container.add(companyLabel);
        container.add(categoryLabel);
        container.add(categoryBox);
        container.add(ratingBox);
        container.add(ratingLabel);
        container.add(aboutButton);
        container.add(statisticsButton);
        container.add(saveButton);
    }


    public void addActionEvent() {
        saveButton.addActionListener(this);
        statisticsButton.addActionListener(this);
        aboutButton.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == aboutButton) {
            AboutFrame ab=new AboutFrame();




        }

        if (e.getSource() == statisticsButton) {
            MovieAnalyzer mv=new MovieAnalyzer();
            StatsticsFrame stfr=new StatsticsFrame(mv);


        }



        if (e.getSource() == saveButton) {
            movie=new Movie();
            movieWriter=new MovieWriter();
            List<String> slist = new ArrayList<String>();
            movie.setCategory(categoryBox.getSelectedItem().toString());
            movie.setCompany(companyTextField.getText());
            movie.setDirector(directorTextField.getText());
            movie.setTitle(titleTextField.getText());
            if (yearBox.getSelectedItem() == null) {
                movie.setYear(0);

            }
            else
                movie.setYear((Integer)yearBox.getSelectedItem());
            if (ratingBox.getSelectedItem() == null) {
                movie.setRating(0);

            }
            else
                movie.setRating((Integer)ratingBox.getSelectedItem());
            if (durationTextField.getText() == null || durationTextField.getText().trim().isEmpty()) {
                movie.setDuration(0);
            }
            else {
                if (isNumeric(durationTextField.getText()))
                movie.setDuration(Integer.parseInt(durationTextField.getText()));
                else
                    movie.setDuration(0);
            }

            JOptionPane pane = new JOptionPane();
            UIManager um = new UIManager();
            um.put("OptionPane.background", Color.LIGHT_GRAY);
            um.put("Panel.background", Color.LIGHT_GRAY);

                    boolean all = true;
                    if (movie.getTitle().equals("")) {
                        slist.add("Enter Title\n");
                        all = false;
                    }
                    else
                        slist.add("");
                    if (movie.getCompany().equals("")) {
                        all = false;
                        slist.add("Enter Company\n");
                    }
                    else
                        slist.add("");
                    if (movie.getDuration()<=0) {
                        all = false;
                        slist.add("Enter Duration\n");
                    }
                    else
                        slist.add("");
                    if (movie.getDirector().equals("")) {
                        slist.add("Enter Director\n");
                        all = false;
                    }
                    else
                        slist.add("");
                    if (movie.getRating()<=0) {
                        slist.add("Choose Rating \n");
                        all = false;
                    }
                    else
                        slist.add("");

                    if (movie.getCategory().equals("")){
                        slist.add("Choose Category");
                        all=false;}
                    else
                        slist.add("");
                    if (movie.getYear()<1888) {
                        all = false;
                        slist.add("Enter Year\n");
                    }
                    else
                        slist.add("");

            if (all == true) {
                pane.showMessageDialog(this, "Movie added Successfully");
                try {
                    movieWriter.addMovie(movie);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else
                pane.showMessageDialog(this, slist.get(0) + slist.get(1) + slist.get(2) + slist.get(3) + slist.get(4) + slist.get(5) + slist.get(6));
        }
    }


    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


}









