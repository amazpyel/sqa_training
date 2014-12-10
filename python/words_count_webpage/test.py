import unittest
import sys
from counter import count_word


class TestTask(unittest.TestCase):
    def setUp(self):
        self.url = 'https://en.wikipedia.org/wiki/Ukraine'
        self.word = 'country'

    @unittest.skipIf(not sys.platform.startswith("linux"), "run only on linux")
    def test1(self):
        pass_result = 50
        actual_result = count_word(self.word, self.url)
        self.assertTrue(actual_result >= pass_result, msg="word count = " + str(actual_result))

if __name__ == '__main__':
    unittest.main()
