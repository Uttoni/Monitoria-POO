

// ============== Tabela

DefaultTableModel dtm;

dtm = (DefaultTableModel) tabela.getModel();

dtm.insertRow(dtm.getRowCount(), new Object[]{
                    dado1,
                    dado2
                });

dtm.removeRow(posicao);

 dtm.getDataVector().removeAllElements();

// ================ lista

DefaultListModel dlm= new DefaultListModel();

lista.setModel(dlm);

dlm.add(i, array.get(i).getDado());

// ============== chooser
JFileChooser chooser = new JFileChooser();//cria uma instancia do JFileChooser
    //filtro para as imagend
FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG & GIF & PNG Images", "jpg", "gif", "png");
    //altera o filtro
chooser.setFileFilter(filtro);

String local = "";
int returnVal = chooser.showOpenDialog(this.inicial.getLbl_imagem());//abre JFileChooser
if (returnVal == JFileChooser.APPROVE_OPTION) {//verifica se clicou em ok
  local = (chooser.getSelectedFile().getAbsolutePath());//local recebe a localização da imagem
}
// ============= look and feel
UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");

// =============topicos

- como criar gui
- adicionar  componentes
- propriedades componentes
- codigo gerado componentes
- eventos
- usando eventos
- como modificar a classe inicial programa
- como chamar outra pagina (cuidade com dispose, exit)
- padrão MVC
