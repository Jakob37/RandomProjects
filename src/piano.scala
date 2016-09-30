import java.io.FileInputStream

import sun.audio.{AudioPlayer, AudioStream}

object piano {

  val piano_note = "music_clips/piano_d4.wav"

  val c = "music_clips/piano_scale/c1.wav"
  val d = "music_clips/piano_scale/d1.wav"
  val e = "music_clips/piano_scale/e1.wav"
  val f = "music_clips/piano_scale/f1.wav"
  val g = "music_clips/piano_scale/g1.wav"
  val a = "music_clips/piano_scale/a1.wav"
  val b = "music_clips/piano_scale/b1.wav"
  val c2 = "music_clips/piano_scale/c2.wav"

  def main(args: Array[String]): Unit = {

    while (true) {

        val piano_line = scala.io.StdIn.readLine()

        for (note <- piano_line) {

          if (note == 'z') {
            play_notes(c)
          }
          else if (note == 'x') {
            play_notes(d)
          }
          else if (note == 'c') {
            play_notes(e)
          }
          else if (note == 'v') {
            play_notes(f)
          }
          else if (note == 'b') {
            play_notes(g)
          }
          else if (note == 'n') {
            play_notes(a)
          }
          else if (note == 'm') {
            play_notes(b)
          }
          else if (note == ',') {
            play_notes(c2)
          }

          Thread.sleep(200)
        }

      }
    }

    def play_notes(piano_note:String): Unit = {

      val in = new FileInputStream(piano_note)
      val audioStream = new AudioStream(in)
      AudioPlayer.player.start(audioStream)
    }
}
