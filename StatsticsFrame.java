import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatsticsFrame extends JFrame implements ActionListener {
    private Container container = getContentPane();
    private JLabel numOfmoviesLabel = new JLabel("Total movies:",SwingConstants.CENTER);
    private JLabel resultOfMoviesLabel;
    private JLabel averageLabel = new JLabel("Average time:",SwingConstants.CENTER);
    private JLabel resultOfAverageLabel;
    private JLabel maxCategoryLabel = new JLabel("Most popular Category:",SwingConstants.CENTER);
    private JLabel resultOfMaxCategoryLabel;
    private JLabel numOfMaxCategoryLabel = new JLabel("With total movies:",SwingConstants.CENTER);
    private JLabel resultOfNumOfMaxCategoryLabel;
    private JLabel oldestLabel = new JLabel("Oldest movie:",SwingConstants.CENTER);
    private JLabel resultOldestLabel;
    private JLabel yearOfOldestLabel;
    private JLabel newestLabel = new JLabel("Newest movie:",SwingConstants.CENTER);
    private JLabel resultNewestLabel;
    private JLabel yearOfNewestLabel;
    private JButton backButton = new JButton("Back");
    private JLabel dur = new JLabel("Minutes",SwingConstants.CENTER);

    StatsticsFrame(MovieAnalyzer movieAnalyzer){
        resultOfMoviesLabel=new JLabel(String.valueOf(movieAnalyzer.getNumOfMovies()),SwingConstants.CENTER);
        resultOfAverageLabel=new JLabel(String.valueOf(movieAnalyzer.getAverageDuration()),SwingConstants.CENTER);
        resultOfMaxCategoryLabel=new JLabel(movieAnalyzer.getMaxCategory(),SwingConstants.CENTER);
        resultOfNumOfMaxCategoryLabel=new JLabel(String.valueOf(movieAnalyzer.getNumOfMaxCategory()),SwingConstants.CENTER);
        resultOldestLabel=new JLabel(movieAnalyzer.getOldestMovie(),SwingConstants.CENTER);
        resultNewestLabel=new JLabel(movieAnalyzer.getNewestMovie(),SwingConstants.CENTER);
        yearOfNewestLabel=new JLabel(String.valueOf(movieAnalyzer.getYearOfNewestMovie()),SwingConstants.CENTER);
        yearOfOldestLabel=new JLabel(String.valueOf(movieAnalyzer.getYearOfOldestMovie()),SwingConstants.CENTER);
        setLayoutManager();
        setLocationAndSize();

        addComponentsToContainer();
        container.setBackground(Color.GRAY);
        addActionEvent();
        this.setVisible(true);
        this.setBounds(10, 10, 500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {

        numOfmoviesLabel.setBounds(10,10,100,30);
        resultOfMoviesLabel.setBounds(120,10,100,30);
        averageLabel.setBounds(10,50,100,30);
        resultOfAverageLabel.setBounds(120,50,100,30);
        dur.setBounds(230,50,100,30);
        maxCategoryLabel.setBounds(10,90,100,30);
        resultOfMaxCategoryLabel.setBounds(120,90,100,30);
        numOfMaxCategoryLabel.setBounds(230,90,100,30);
        resultOfNumOfMaxCategoryLabel.setBounds(350,90,100,30);
        oldestLabel.setBounds(10,130,100,30);
        resultOldestLabel.setBounds(120,130,100,30);
        yearOfOldestLabel.setBounds(230,130,100,30);
        newestLabel.setBounds(10,170,100,30);
        resultNewestLabel.setBounds(120,170,100,30);
        yearOfNewestLabel.setBounds(230,170,100,30);
        backButton.setBounds(200,210,100,30);






    }

    public void addComponentsToContainer() {
        container.add(numOfmoviesLabel);
        container.add(resultOfMoviesLabel);
        container.add(averageLabel);
        container.add(resultOfAverageLabel);
        container.add(maxCategoryLabel);
        container.add(resultOfMaxCategoryLabel);
        container.add(numOfMaxCategoryLabel);
        container.add(resultOfNumOfMaxCategoryLabel);
        container.add(oldestLabel);
        container.add(resultOldestLabel);
        container.add(yearOfOldestLabel);
        container.add(newestLabel);
        container.add(yearOfNewestLabel);
        container.add(resultNewestLabel);
        container.add(backButton);
        container.add(dur);

    }
    public void addActionEvent() {
        backButton.addActionListener(this);

    }






    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
            this.dispose();
        }

    }
}
