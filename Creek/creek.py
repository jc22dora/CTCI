import PyPDF2
import re
class Creek:
    def __init__(self):
        self.pdfText = ""

    def getPdf(self):
        object = PyPDF2.PdfFileReader(r"C:\Users\18458\Documents\GitHub\CTCI\Creek\Mvskoke.pdf")
        NumPages = object.getNumPages()
        Text = ""
        for i in range(0, NumPages):
            PageObj = object.getPage(i)
            Text += PageObj.extractText() 
        self.text = Text

    def cleanPdf(self):
        self.text = re.sub("[^a-zA-Z]+", "",self.text)


if __name__ == "__main__":
    pdf1 = Creek()
    pdf1.getPdf()
    pdf1.cleanPdf()
    print(pdf1.text)
