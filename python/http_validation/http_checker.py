import unittest
import requests
import lxml.html
import xmlrunner


class TestHtmlTask(unittest.TestCase):
    def setUp(self):
        self.urls = open("urls.txt", 'r')
        self.url_google = self.urls.readline()
        self.url_habr = self.urls.readline()
        self.urls.close()

    def test_1(self):
        expected_response_1 = 200
        r = requests.get(self.url_google.strip())
        self.assertEqual(r.status_code, expected_response_1)

    def test_2(self):
        expected_response_2 = "Game Development"
        t = lxml.html.parse(self.url_habr)
        title = t.find(".//title").text.split('/')
        self.assertEqual(title[0].rstrip(), expected_response_2)


if __name__ == '__main__':
    unittest.main(testRunner=xmlrunner.XMLTestRunner(output='test-reports'))
