/**
  * Created by multiangle on 17-7-7.
  */

import scala.io.Source
import com.huaban.analysis.jieba.JiebaSegmenter


import java.util.List ;

class WordCutter{
  
}

object file {
  def readFile(file_path:String):Iterator[String]={
    val ret = Source.fromFile(file_path).getLines()
    ret
  }

  def cutWord(sentence: String, segmenter: JiebaSegmenter):List[String]={
    var res:List[String] = segmenter.sentenceProcess(sentence) ;
    res
  }

  def filterWord(words: List[String], stop_words: Set[String]): Unit = {
    for( i <- Range(words.size()-1, -1, -1)){
      if (words.get(i).contains(' ')){
        val n_w = words.get(i).replaceAll(" ","")
        words.set(i, n_w)
      }
      if (stop_words.contains(words.get(i))){
        words.remove(i)
      }
    }
  }

}
