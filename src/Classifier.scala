import com.huaban.analysis.jieba.JiebaSegmenter

/**
  * Created by multiangle on 17-7-7.
  */



object Classifier {
  def main(args: Array[String]): Unit = {
    val base_dir: String = "/media/multiangle/F/DataSet/THUCNews/THUCNewsPart" ;
    val file_path: String = base_dir + "/财经/801184.txt"
    val content = file.readFile(file_path)
    val stop_word = file.readFile("static/stop_words.txt")
    val segmenter: JiebaSegmenter = new JiebaSegmenter
    for(s:String<-content){
      val ori_words = file.cutWord(s, segmenter)
      file.filterWord(ori_words, stop_word)

    }
  }
}
