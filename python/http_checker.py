import unittest
import requests
import lxml.html


class TestHtmlTask(unittest.TestCase):
    def setUp(self):
        self.ulr_google = "https://www.google.com.ua/"
        self.url_habr = "http://habrahabr.ru/hub/gdev/"

    def test_1(self):
        expected_response_1 = 200
        r = requests.get(self.ulr_google)
        self.assertEqual(r.status_code, expected_response_1)

    def test_2(self):
        expected_response_2 = "Game Development"
        t = lxml.html.parse(self.url_habr)
        title = t.find(".//title").text.split('/')
        self.assertEqual(title[0].rstrip(), expected_response_2)

if __name__ == '__main__':
    unittest.main()
