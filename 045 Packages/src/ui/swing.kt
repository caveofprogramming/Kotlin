package ui

import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.SwingUtilities

fun main() {
    // Use SwingUtilities to ensure the UI updates occur on the Event Dispatch Thread
    SwingUtilities.invokeLater {
        // Create the JFrame
        val frame = JFrame("Minimal Swing App")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        // Add a simple JLabel
        val label = JLabel("Hello, Swing and Kotlin!")
        frame.add(label)

        // Set frame size and make it visible
        frame.setSize(300, 200)
        frame.isVisible = true
    }
}
